package com.atguigu.controller;

import com.atguigu.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    public String queryStudent(Integer id){
        return studentService.selectById(id).toString();
    }

}
