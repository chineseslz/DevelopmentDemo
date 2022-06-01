package com.atdonglijiedian.service.impl;

import com.atdonglijiedian.dao.UsersMapper;
import com.atdonglijiedian.dao.UsersMapperImpl;
import com.atdonglijiedian.pojo.Users;
import com.atdonglijiedian.service.UsersService;

/**
 * 业务逻辑层的实现类
 */

public class UsersServiceImpl implements UsersService {

    private UsersMapper usersMapper = new UsersMapperImpl();

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
