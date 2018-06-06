package commision.core.fileobjectreaders;

import commision.core.filereaders.CSVFileReader;
import commision.core.filereaders.DataFileReader;
import commision.core.filereaders.XExcelFileReader;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by radoslaw.wojcik on 2017-11-08.
 */
public abstract class ObjectFileReader<E> {

    private final int DEFAULT_ROW_NUMBERS = 10000000;

    private InputStream inputStream;
    private String path;
    private List<String[]> fileData;
    private String[] headers;
    private String fileType;
    private char delimiter;
    private boolean isHeadres;

    public boolean saveFile(InputStream inputStream, String fileType){
        this.inputStream = inputStream;
        this.fileType = fileType;
        path = System.getProperty("user.home") + File.separator + "import_" + new Date().getTime() + fileType;
        File file = new File(path);
        try {
            byte[] tabByte = new byte[inputStream.available()];
            inputStream.read(tabByte);
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(tabByte);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public List<E> readFileData(char delimiter) {
        this.delimiter = delimiter;
        List<E> objectList = new ArrayList<>();
        Iterator<String[]> iterator = getFileData().iterator();
        while(iterator.hasNext() && !isHeadres){
            headers = iterator.next();
            if(headers[1].length() > 1) isHeadres = true;
        }
        while(iterator.hasNext()){
            objectList.add(getRow(iterator.next()));
        }
        return objectList;
    }

    public List<String[]> getFileData(){
        return getFileData(DEFAULT_ROW_NUMBERS);
    }

    public List<String[]> getFileData(int rowNumbers){
        try {
            DataFileReader fileReader = null;
            if(fileType.equals(".csv"))
                fileReader = new CSVFileReader(path, delimiter);
            if(fileType.equals(".xls") || fileType.equals(".xlsx"))
                fileReader = new XExcelFileReader(path);

            fileData = fileReader.readRows(rowNumbers);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileData;
    }

    public String[] getHeaders(){
        return headers;
    }

    public abstract E getRow(String[] row);
}
