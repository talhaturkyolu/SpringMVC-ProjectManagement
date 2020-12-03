package com.befty.bootstrap;

import com.befty.dto.ProjectDTO;
import com.befty.dto.RoleDTO;
import com.befty.dto.UserDTO;
import com.befty.enums.Gender;
import com.befty.enums.Status;
import com.befty.service.ProjectService;
import com.befty.service.RoleService;
import com.befty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    @Autowired
    public DataGenerator(RoleService roleService, UserService userService,ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@befty.com", "abc", true, "7459684532", managerRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "Kesy",
                "admin2@befty.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@befty.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@befty.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@befty.com", "123", true, "3256987412", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);

        ProjectDTO project1 = new ProjectDTO("Spring MVC", "PR001",user1, LocalDate.now(),LocalDate.now().plusDays(25),
                "Creating Controllers", Status.OPEN);
        ProjectDTO project2 = new ProjectDTO("Spring ORM", "PR002",user2, LocalDate.now(),LocalDate.now().plusDays(10),
                "Creating Database", Status.IN_PROGRESS);
        ProjectDTO project3 = new ProjectDTO("Spring Container", "PR003",user1, LocalDate.now(),LocalDate.now().plusDays(32),
                "Creating Container", Status.UAT_TEST);

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);




    }
}
