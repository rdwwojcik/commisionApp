package commision.core.services.database.impl;

import commision.core.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import commision.core.dto.UserDTO;
import commision.core.mappers.UserMapper;
import commision.core.repositories.UserRepository;
import commision.core.services.database.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper     mapper;

    @Autowired
    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User newUser = repository.save(mapper.fromDTO(userDTO));
//        System.out.println("************Role: + " + userDTO.getRoles().toString());
        return mapper.toDTO(newUser);
    }

    @Override
    public UserDTO getUserByID(Long id) {
        return mapper.toDTO(repository.findOne(id));
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return mapper.toDTO(repository.findByEmail(email));
    }
}