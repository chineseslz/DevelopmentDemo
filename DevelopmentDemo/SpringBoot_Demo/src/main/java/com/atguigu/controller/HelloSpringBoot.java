package com.atguigu.controller;

import com.atguigu.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @Resource
    private SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        return this.name+this.port;
    }



    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return info.toString();
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "访问user、account";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(){
        return "访问user、login";
    }

}
