package com.zeer.service;

import com.zeer.dao.UserDao;
import com.zeer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository(value = "userService")
public class UserService {
    @Autowired
    UserDao userDao=new UserDao();
    public boolean hasMatch(String username, String password)
    {
        int query= 0;
        try {
            query = userDao.matchUser(username,password);
        } catch (Exception e) {
            return false;
        }
        if(query!=0) return true;
        else return false;
    }
    public boolean hasAdd(User user)
    {
             return userDao.addUser(user);
    }
    public User hasSelect(String username)
    {
        return userDao.selectUser(username);
    }
}
