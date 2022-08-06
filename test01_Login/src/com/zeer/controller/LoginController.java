package com.zeer.controller;

import com.zeer.dao.UserDao;
import com.zeer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@SessionAttributes("username")
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService userService=new UserService();
    @RequestMapping("/enter")
    public  String loginEnter(String username,String password,Map<String,Object> map){
        boolean isHave=userService.hasMatch(username,password);
        if(isHave)
        {
            map.put("username", username);
            return "login_success";
        }
        else return "login_error";
    }

}
