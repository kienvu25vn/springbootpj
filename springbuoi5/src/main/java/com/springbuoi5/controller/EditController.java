package com.springbuoi5.controller;


import com.springbuoi5.entity.User;
import com.springbuoi5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class EditController {
    @Autowired
    private UserService userService;

    @GetMapping("/edit")
    public String edit(@RequestParam Long id , Model model){
        model.addAttribute("user" , userService.getUserById(id));
        return "edit";
    }

    @PutMapping("/edit")
    public String editUser(@Valid User user  , BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "edit";
        userService.save(user);
        return "redirect:/";
    }

}
