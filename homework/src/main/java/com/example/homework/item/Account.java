package com.example.homework.item;

public class Account {

    private String username;
    private String password;
    private boolean identity;//true: 学生 false:教师

    public Account(String username, String password , boolean identity){
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIdentity() {
        return identity;
    }

    //判断账户是否合法 true为合法，false为非法
    public boolean isLegal(){
        return true;
    }
}
