package commision.core.services.file;

import commision.core.dto.UploadFileDto;

import java.util.List;

/**
 * Created by Radek on 19.11.2017.
 */
public interface FileService {

    void saveToDisck();

    List readFileData();

    void init(UploadFileDto fileDto);
}
