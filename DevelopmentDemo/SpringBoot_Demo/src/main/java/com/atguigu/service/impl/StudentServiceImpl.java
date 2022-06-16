package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.service.StudentService;
import com.atguigu.vo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }

}
