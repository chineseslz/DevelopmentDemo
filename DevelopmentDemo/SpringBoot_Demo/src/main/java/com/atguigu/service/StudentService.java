package com.atguigu.service;

import com.atguigu.vo.Student;

public interface StudentService  {

    Student selectById(Integer id);

    int insertStudent(Student student);

}
