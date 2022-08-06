package com.zeer.dao;

import com.zeer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDao {
    @Autowired
//    还有加密操作
    private JdbcTemplate jdbcTemplate;
    public Integer matchUser(String username, String password) throws Exception
    {
        String sql="SELECT id FROM users WHERE username=? and password=HEX(AES_ENCRYPT(?, \"wifi\"))";
        Integer query;
            query=jdbcTemplate.queryForObject(sql,Integer.class,new Object[]{username,password});

        System.out.println(query);
        return query;
    }
    public  Integer checkUser(User user) {
        String sql="SELECT id FROM users WHERE username=?";
        Integer id;
        try{
            id=jdbcTemplate.queryForObject(sql,Integer.class,user.getUsername());
        }catch (Exception e) {
            return 0;
        }
        return id;
    }
    public boolean addUser(User user)
    {
        Integer id = checkUser(user);
        if(id!=0) return false;
        String sql="INSERT INTO users(username,password,studentID) VALUES(?,HEX(AES_ENCRYPT(?, \"wifi\")),?)";
        Integer query=jdbcTemplate.update(sql,new Object[]{user.getUsername(),user.getPassword(),user.getstudentID()});
        System.out.println(query);
        return true;
    }
    public User selectUser(String username)
    {
        String sql="SELECT * FROM users WHERE username=?";
        User query=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),username);
        System.out.println(query);
        return query;
    }

}
