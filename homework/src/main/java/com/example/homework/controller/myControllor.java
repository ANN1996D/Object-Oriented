package com.example.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class myControllor {

    @RequestMapping({"/",""})
    public String index(){
        return "login";
    }//初始登录页面

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }//返回文本


    @RequestMapping("/hhh")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("user", Arrays.asList("张三","lisi","ssad"));
        return "hhh";
    }//返回页面hhh.html
}