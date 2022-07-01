package com.springbuoi5.controller;


import com.springbuoi5.entity.User;
import com.springbuoi5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class AddController {
        @Autowired
        private UserService userService;

        @GetMapping("/add")
        public String add(Model model){
            model.addAttribute("user" , new User());
            return "add";
        }

        @PostMapping("/add")
        public String addUser(@Valid User user , BindingResult bindingResult){
            if(bindingResult.hasErrors())
                return "add";
            userService.save(user);
            return "redirect:/";
        }
}
