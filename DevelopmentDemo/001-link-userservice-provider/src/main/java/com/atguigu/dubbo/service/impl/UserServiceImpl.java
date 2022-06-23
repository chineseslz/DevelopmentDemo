package com.atguigu.dubbo.service.impl;

import com.atguigu.dubbo.model.User;
import com.atguigu.dubbo.service.UserService;


public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User(id,"slz",23);
        return user;
    }
}
