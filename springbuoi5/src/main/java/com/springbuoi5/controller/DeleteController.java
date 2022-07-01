package com.springbuoi5.controller;

import com.springbuoi5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    @Autowired
    private UserService userService;

    @DeleteMapping("/delete")
    public String delete(@RequestParam Long id){
        userService.delete(id);
        return "redirect:/";
    }
}
