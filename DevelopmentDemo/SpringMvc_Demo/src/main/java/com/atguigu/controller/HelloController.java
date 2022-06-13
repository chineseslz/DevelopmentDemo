package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/test",method = {RequestMethod.POST})
    public String test(){
        return "hello";
    }


//    @RequestMapping(value = "/hello")
    @RequestMapping(
            value = {"/hello/hello"}
    )
    public String hello(){
        return "hello";
    }




}
