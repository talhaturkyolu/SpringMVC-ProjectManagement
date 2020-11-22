package com.befty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping({"/create","/add","/initialize"}) // Defined couple of end points
    public String createUser(){
        return "user/create";
    }

}
