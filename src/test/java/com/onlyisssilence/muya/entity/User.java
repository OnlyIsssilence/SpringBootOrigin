package com.onlyisssilence.muya.entity;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-08-02
 * Time: 下午 10:29
 */
public class User {
    private int id;
    private String nickName;
    private String email;
    private String honnr;
    private String password;

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHonnr() {
        return honnr;
    }

    public void setHonnr(String honnr) {
        this.honnr = honnr;
    }
}
