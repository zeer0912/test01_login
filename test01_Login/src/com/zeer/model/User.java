package com.zeer.model;

public class User {
    private String username;
    private String password;
    private Integer id;
    private String studentID;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getstudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
       this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
