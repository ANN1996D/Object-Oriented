package com.example.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/login")
    public String Login(@RequestParam("action") String action,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("role") String role,
                        Map<String,Object> map){
        System.out.println(role);
        if("login".equals(action)){
            //登陆操作
            if(StringUtils.isEmpty(username)){
                map.put("err","用户名不能为空");
                return "login";
            }else if(StringUtils.isEmpty(password)){
                map.put("err","密码不能为空");
                return "login";
            }else if(true) {
                //登陆成功
                if ("student".equals(role)) {
                    return "student";
                } else {
                    return "teacher";
                }
            } else{
                //登陆失败
                map.put("err","用户名密码错误");
                return "login";
            }

        }else{
            //注册操作
            return "register";
        }

    }

}
