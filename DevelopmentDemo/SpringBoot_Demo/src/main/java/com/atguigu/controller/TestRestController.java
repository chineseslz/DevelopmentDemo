package com.atguigu.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @PutMapping("/student/put")
    public String put(){
        return "执行student/put";
    }

    @DeleteMapping("/student/delete")
    public String delete(){
        return "执行student/delete";
    }

}
