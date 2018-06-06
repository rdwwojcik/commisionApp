package commision.core.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import commision.core.dto.UserDTO;
import commision.core.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User    fromDTO(UserDTO userDTO);

    UserDTO toDTO(User user);
}
