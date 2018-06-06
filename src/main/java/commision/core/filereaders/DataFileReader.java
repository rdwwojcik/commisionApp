package commision.core.filereaders;

import java.util.List;

/**
 * Created by radoslaw.wojcik on 2017-11-08.
 */
public interface DataFileReader {
    int rowNum();
    List<String[]> readRows(int batchSize) throws Exception;
}