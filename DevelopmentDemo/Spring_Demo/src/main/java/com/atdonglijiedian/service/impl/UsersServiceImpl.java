package com.atdonglijiedian.service.impl;

import com.atdonglijiedian.dao.UsersMapper;
import com.atdonglijiedian.pojo.Users;
import com.atdonglijiedian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层的实现类
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
