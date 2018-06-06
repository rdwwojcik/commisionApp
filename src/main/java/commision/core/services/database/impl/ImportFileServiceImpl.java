package commision.core.services.database.impl;

import commision.core.dto.UploadFileDto;
import commision.core.entities.BaseImportFileEntity;
import commision.core.entities.FileEntity;
import commision.core.entities.pma.Pma;
import commision.core.repositories.FileEntityRepository;
import commision.core.repositories.ImportFileRepository;
import commision.core.services.database.PmaService;
import commision.core.services.file.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Radek on 24.10.2017.
 */
@Service
public class ImportFileServiceImpl implements PmaService {

    private final ImportFileRepository repository;
    private final FileService fileService;
    private final FileEntityRepository fileRepository;

    @Autowired
    public ImportFileServiceImpl(ImportFileRepository repository, FileService fileService, FileEntityRepository fileRepository) {
        this.repository = repository;
        this.fileService = fileService;
        this.fileRepository = fileRepository;
    }

    @Override
    public Pma saveTest(Pma pma) {
        return repository.save(pma);
    }

    @Override
    @Transactional
    public int savePma(UploadFileDto fileDto) {
        FileEntity file = new FileEntity();
        file.setName(fileDto.getFile().getOriginalFilename());
        file.setType(12L);
        FileEntity savedFileEntity = fileRepository.save(file);

        fileService.init(fileDto);
        fileService.saveToDisck();
        List<BaseImportFileEntity> fileData = fileService.readFileData();
        fileData.stream().forEach(s -> s.setFileEntity(savedFileEntity));
        List savedList = repository.save(fileData);

        return fileData.size();
    }
}
