package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

//    @RequestMapping(value = "/")
//    public String index(){
//        return "index";
//    }

    /**
     * @PathVariable   路径：/../{id}/{username}
     * @RequestParam   路径：/..(id='',username='')   前端传送名和属性名一致，可忽略不写
     */
    @RequestMapping(value = "/params")
    private String params(
            String username,
            Integer age,
            @RequestHeader("Host")String host){
        System.out.println(username+":"+age);
        System.out.println(host);
        return "hello";
    }

}
