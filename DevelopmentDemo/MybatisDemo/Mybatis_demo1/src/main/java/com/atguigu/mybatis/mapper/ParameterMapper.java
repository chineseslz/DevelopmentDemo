package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 1.#{}  ${}
     * 2.param1，param2
     * 3.map集合
     * 4.实体类对象User
     * 5.自定义@param
     */

    /**
     * 验证登录，（使用@param）
     */
    User checkLoginByParam(@Param("username") String username,
                           @Param("password") String password);

    /**
     * 验证登录，（参数为map）
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加用户信息
     */
    int insertUser(User user);


    /**
     * 查询所有员工信息
     */

    List<User> getAllUser();

    /**
     * 根据用户名查询
     */
    User getUserByUserName(String username);

    /**
     * 验证登录
     */
    User checkLogin(String username,String password);

}
