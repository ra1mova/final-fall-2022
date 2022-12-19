package com.example.webmidspring.controllers;

import com.example.webmidspring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    private UserService usersService;

    public UsersController(UserService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "users";
    }

}
