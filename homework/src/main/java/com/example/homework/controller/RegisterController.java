package com.example.homework.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegisterController {

    @PostMapping(value = "/register")
    public String Register(String username, String password, String passwordConfirmed,
                        String name, String id, String sex, String phoneNumber, String email,
                        Map<String,Object> map) {

        if(password.equals(passwordConfirmed)){
            //注册成功，返回登录页面
            map.put("pass","注册成功,请登录！");
            return "login";
        } else{
            //注册失败
            map.put("err","两次密码输入不一致");
            return "register";
        }
    }
}
