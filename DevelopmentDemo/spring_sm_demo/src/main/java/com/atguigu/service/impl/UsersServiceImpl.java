package com.atguigu.service.impl;

import com.atguigu.mapper.UsersMapper;
import com.atguigu.pojo.Users;
import com.atguigu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    UsersMapper usersMapper;


    @Override
    public int insert(Users users) {
        int num = usersMapper.insert(users);
        return num;
    }
}
