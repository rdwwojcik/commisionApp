package commision.core.services.file.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import commision.core.dto.UploadFileDto;
import commision.core.fileobjectreaders.ObjectFileReader;
import commision.core.fileobjectreaders.factories.PmaReaderFactory;
import commision.core.services.file.FileService;

import java.io.IOException;
import java.util.List;

/**
 * Created by Radek on 19.11.2017.
 */
@Service
public class FileServiceImpl implements FileService{

    private PmaReaderFactory readerFactory;
    private ObjectFileReader fileReader;
    private MultipartFile multipartFile;
    private char delimiter;

    @Autowired
    public FileServiceImpl(PmaReaderFactory readerFactory) {
        this.readerFactory = readerFactory;
    }

    @Override
    public void saveToDisck() {
        try {
            String filename = multipartFile.getOriginalFilename();
            String extension = filename.substring(filename.lastIndexOf("."));
            fileReader.saveFile(multipartFile.getInputStream(), extension);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List readFileData() {
        List fileData = fileReader.readFileData(delimiter);
        return fileData;
    }

    @Override
    public void init(UploadFileDto fileDto) {
        fileReader = readerFactory.getInstance(fileDto.getChannel());
        multipartFile = fileDto.getFile();
        delimiter = fileDto.getDelimiter();
    }
}
