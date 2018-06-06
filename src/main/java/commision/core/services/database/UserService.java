package commision.core.services.database;

import commision.core.dto.UserDTO;

public interface UserService {

    UserDTO addUser(UserDTO user);

    UserDTO getUserByID(Long id);

    UserDTO getUserByEmail(String email);
}
