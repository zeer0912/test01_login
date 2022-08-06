package com.zeer.controller;

import com.zeer.model.User;
import com.zeer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class PersonController {
    @Autowired
    UserService userService=new UserService();
    @RequestMapping("/person")
    public ModelAndView select(String username){
        System.out.println(username);
        User user=userService.hasSelect(username);
        ModelAndView mv = new ModelAndView("person");
        mv.addObject("user",user);
        return mv;
    }
}
