package com.atguigu.dao;

import com.atguigu.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Mapper：告诉mybatis这是dao接口，创建此接口的代理对象
 */
public interface StudentDao {
    Student selectById(@Param("stuId")Integer id);

    int insertStudent(Student student);
}
