package commision.core.filereaders;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.eventusermodel.ReadOnlySharedStringsTable;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author radek
 *http://lchenaction.blogspot.com/2013/12/how-to-read-super-large-excel-and-csv.html
 */
public class XExcelFileReader implements DataFileReader{
    private int rowNum = 0;
    private OPCPackage opcPkg;
    private ReadOnlySharedStringsTable stringsTable;
    private XMLStreamReader xmlReader;

    public XExcelFileReader(String excelPath) throws Exception {
        opcPkg = OPCPackage.open(excelPath, PackageAccess.READ);
        this.stringsTable = new ReadOnlySharedStringsTable(opcPkg);

        XSSFReader xssfReader = new XSSFReader(opcPkg);
        XMLInputFactory factory = XMLInputFactory.newInstance();
        InputStream inputStream = xssfReader.getSheetsData().next();
        xmlReader = factory.createXMLStreamReader(inputStream);

        while (xmlReader.hasNext()) {
            xmlReader.next();
            if (xmlReader.isStartElement()) {
                if (xmlReader.getLocalName().equals("sheetData"))
                    break;
            }
        }
    }

    @Override
    public int rowNum() {
        return rowNum;
    }

    @Override
    public List<String[]> readRows(int batchSize) throws Exception {
        String elementName = "row";
        List<String[]> dataRows = new ArrayList<String[]>();
        if (batchSize > 0) {
            while (xmlReader.hasNext()) {
                xmlReader.next();
                if (xmlReader.isStartElement()) {
                    if (xmlReader.getLocalName().equals(elementName)) {
                        rowNum++;
                        dataRows.add(getDataRow());
//                        if (dataRows.size() == batchSize)
//                            break;
                    }
                }
            }
        }
        return dataRows;
    }

    private String[] getDataRow() throws XMLStreamException {
        List<String> rowValues = new ArrayList<String>();
        while (xmlReader.hasNext()) {
            xmlReader.next();
            if (xmlReader.isStartElement()) {
                if (xmlReader.getLocalName().equals("c")) {
                    CellReference cellReference = new CellReference(xmlReader.getAttributeValue(null, "r"));
                    // Fill in the possible blank cells!
                    while (rowValues.size() < cellReference.getCol()) {
                        rowValues.add("");
                    }
                    String cellType = xmlReader.getAttributeValue(null, "t");
                    rowValues.add(getCellValue(cellType));
                }
            } else if (xmlReader.isEndElement() && xmlReader.getLocalName().equals("row")) {
                break;
            }
        }
        return rowValues.toArray(new String[rowValues.size()]);
    }

    private String getCellValue(String cellType) throws XMLStreamException {
        String value = ""; // by default
        while (xmlReader.hasNext()) {
            xmlReader.next();
            if (xmlReader.isStartElement()) {
                if (xmlReader.getLocalName().equals("v")) {
                    if (cellType != null && cellType.equals("s")) {
                        int idx = Integer.parseInt(xmlReader.getElementText());
                        return new XSSFRichTextString(stringsTable.getEntryAt(idx)).toString();
                    } else {
                        return xmlReader.getElementText();
                    }
                }
            } else if (xmlReader.isEndElement() && xmlReader.getLocalName().equals("c")) {
                break;
            }
        }
        return value;
    }

    public void finalize() throws Throwable {
        if (opcPkg != null)
            opcPkg.close();
        super.finalize();
    }
}

