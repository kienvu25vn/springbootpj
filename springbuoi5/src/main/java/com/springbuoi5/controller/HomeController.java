package com.springbuoi5.controller;

import com.springbuoi5.entity.User;
import com.springbuoi5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("users" , userService.getAllUsers());
        return "home";
    }

    @PostMapping("/search")
    public String searchUser(Model model ,@RequestParam(value = "username") String username){
        if(username.equals("")) {
            return "redirect:/";
        }
        else
            model.addAttribute("users" , userService.getUserContainUserName(username));
        return "home";
    }

    @GetMapping("/back")
    public String back(){
        return "redirect:/";
    }
}
