package com.befty.bootstrap;

import com.befty.dto.RoleDTO;
import com.befty.dto.UserDTO;
import com.befty.enums.Gender;
import com.befty.implementation.RoleServiceImpl;
import com.befty.service.RoleService;
import com.befty.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }



    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(1L,"Manager");
        RoleDTO employeeRole = new RoleDTO(1L,"Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "Kesy",
                "admin2@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@cybertek.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@cybertek.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@cybertek.com", "123", true, "3256987412", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);

    }
}
