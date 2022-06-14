package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot";
    }

    @Value("${server.port}")
    private Integer port;

    @Value("${school.name}")
    private String name;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        return name;
    }

}
