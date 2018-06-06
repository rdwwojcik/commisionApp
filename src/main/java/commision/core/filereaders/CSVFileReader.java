package commision.core.filereaders;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by radoslaw.wojcik on 2017-11-08.
 */
public class CSVFileReader implements DataFileReader{
    private int rowNum = 0; // current row number!
    private CSVReader reader;

    public CSVFileReader(String csvPath, char delimiter) throws Exception {
        this.reader = new CSVReader(new FileReader(csvPath), delimiter);
    }

    @Override
    public int rowNum() {
        return rowNum;
    }

    @Override
    public List<String[]> readRows(int batchSize) throws IOException {
        List<String[]> dataRows = new ArrayList<String[]>();
        if (batchSize > 0) {
            String[] dataRow = null;
            while ((dataRow = reader.readNext()) != null) {
                rowNum++;
                dataRows.add(dataRow);
                if (dataRows.size() == batchSize)
                    break;
            }
        }
        return dataRows;
    }
}
