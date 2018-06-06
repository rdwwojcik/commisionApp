package commision.core.mappers;

import commision.core.dto.FileDTO;
import commision.core.entities.FileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.io.IOException;

@Mapper(componentModel = "spring")
public interface FileMapper {

    FileMapper INSTANCE = Mappers.getMapper(FileMapper.class);

    FileDTO toDto(FileEntity fileEntity);

//    @Mapping(target = "file", expression = "java(fileDTO.getFile().getBytes())")
    FileEntity fromDto(FileDTO fileDTO) throws IOException;
}
