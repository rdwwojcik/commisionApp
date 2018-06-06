package commision.core.services;

import commision.core.dto.UserDTO;
import commision.core.security.CurrentUser;
import commision.core.services.database.UserService;
import org.apache.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final static Logger logger = Logger.getLogger(UserDetailsServiceImpl.class);

    private final UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDTO userDTO = userService.getUserByEmail(s);

        System.out.println("*********************************");
        System.out.println("Login: " + userDTO.getEmail());
        System.out.println("Password: " + userDTO.getPassword());
        System.out.println("Hash: " + userDTO.getHashPassword());
        System.out.println("*********************************");

        logger.info("Password: " + userDTO.getPassword());
        logger.info("Hash Password: " + userDTO.getHashPassword());

        if(userDTO != null){
            return new CurrentUser(userDTO);
        }
        else{
            throw new UsernameNotFoundException("User not found for login: " + userDTO.getEmail());
        }
    }
}
