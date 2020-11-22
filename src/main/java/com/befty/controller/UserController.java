package com.befty.controller;

import com.befty.dto.RoleDTO;
import com.befty.dto.UserDTO;
import com.befty.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create") // Defined couple of end points
    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());

        //data generator


        return "user/create";
    }

}
