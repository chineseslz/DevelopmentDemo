package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.service.StudentService;
import com.atguigu.vo.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }


    /**
     * @Transactional: 表示方法的有事务支持
     * 默认：使用库的隔离级别，可重复读； REQUIRED 传播行为； 超时时间  -1
     * 抛出运行时异常，回滚事务
     */
    @Transactional
    @Override
    public int insertStudent(Student student) {
        System.out.println("业务方法insertStudent");
        int i = studentDao.insertStudent(student);
        System.out.println("执行sql语句");
        return i;
    }

}
