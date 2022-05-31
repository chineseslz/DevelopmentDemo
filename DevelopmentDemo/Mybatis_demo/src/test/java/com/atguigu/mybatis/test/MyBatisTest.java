package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class MyBatisTest {


    @Test
    public static void main(String[] args) throws IOException {


        //获取sqlSession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取mapper接口对象  (获取usermapper实现类对象(实例))
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

//        User user = new User(null,"李四","123",36,"男","5655@qq.com");
//        int result = mapper.insertUser(user);


        System.out.println( mapper.getAllUserToMap());

        //提交事务
//        sqlSession.commit();      (设置自动提交,true)



    }



}
