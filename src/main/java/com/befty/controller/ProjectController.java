package com.befty.controller;

import com.befty.dto.ProjectDTO;
import com.befty.dto.UserDTO;
import com.befty.service.ProjectService;
import com.befty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createProject(Model model){
        model.addAttribute("project",new ProjectDTO());
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findAll());

        return "/project/create";
    }
}
