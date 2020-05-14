package com.example.homework.item;

import java.util.Map;

public class Information {

    private String name;
    private String id;
    private String phoneNumber;
    private String email;
    private String sex;
    //此处添加作业信息

    public Information(Map<String,String> map){

        this.name = map.get("name");
        this.id = map.get("id");
        this.phoneNumber = map.get("phoneNumber");
        this.email = map.get("email");
        this.sex = map.get("sex");
    }

    public void printAll(){

    }
}
