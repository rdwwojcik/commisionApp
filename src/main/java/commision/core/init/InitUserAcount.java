package commision.core.init;

import commision.core.dto.UserDTO;
import commision.core.services.database.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitUserAcount {

    private final UserService userService;

    public InitUserAcount(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init(){
        UserDTO user = new UserDTO();
        user.setFirstName("Radek");
        user.setLastName("Wójcik");
        user.setEmail("rdwwojcik");
        user.setPassword("password22");

        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashPass = encoder.encode("password22");

        user.setHashPassword(hashPass);
        user.setStatus(1);

//        Role role = new Role();
//        role.setRole("USER");
//
//        List<Role> roleList = new ArrayList<>();
//        roleList.add(role);
//
//        user.setRoles(roleList);

//        List<User> users = new ArrayList<>();
//        users.add(user);

        userService.addUser(user);
    }

//public class InitUserAcount implements ApplicationListener<ContextRefreshedEvent> {
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//
//        ApplicationContext context = contextRefreshedEvent.getApplicationContext();
//        System.out.println("-----------------------------Application Event----------------------------");
//        System.out.println("::::::::::::::::"+context.getDisplayName()+":::::::::::::::::::::::::::::::::");
//        System.out.println("-----------------------------Application Event----------------------------");
//
//        UserDTO user = new UserDTO();
//        user.setName("Radek");
//        user.setSurname("Wójcik");
//        user.setEmail("rdwwojcik");
//        user.setPassword("password");
//
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        String hashPass = encoder.encode("password");
//
//        user.setHashPassword(hashPass);
//        user.setStatus(1);
//        user.setDateOn(new Date());
//
//        userService.addUser(user);
//    }
}
