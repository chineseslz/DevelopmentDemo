package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {


    @Test
    public static void main(String[] args) throws IOException {


        //获取sqlSession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取mapper接口对象  (获取usermapper实现类对象(实例))
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

//        User user = new User(null,"李四","123",36,"男","5655@qq.com");
//        int result = mapper.insertUser(user);

        User result = mapper.checkLoginByParam("admin","123456");
        System.out.println(result);

        //提交事务
//        sqlSession.commit();      (设置自动提交,true)



    }



}
