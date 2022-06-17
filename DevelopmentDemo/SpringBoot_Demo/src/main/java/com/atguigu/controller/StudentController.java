package com.atguigu.controller;

import com.atguigu.service.StudentService;
import com.atguigu.vo.Student;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    public String queryStudent(Integer id) {
        return studentService.selectById(id).toString();
    }

    @RequestMapping("/student/add")
    public String queryStudent(String name, Integer age) {
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);
        int rows = studentService.insertStudent(s1);
        return "添加学生：" + rows;
    }

}
