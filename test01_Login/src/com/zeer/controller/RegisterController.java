package com.zeer.controller;

import com.zeer.model.User;
import com.zeer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    UserService userService=new UserService();
    @RequestMapping("/enter")
    public String register(User user){
        System.out.println(user.getUsername());
        if(userService.hasAdd(user))
            return "register_success";
        else return "error_name";


    }
}
