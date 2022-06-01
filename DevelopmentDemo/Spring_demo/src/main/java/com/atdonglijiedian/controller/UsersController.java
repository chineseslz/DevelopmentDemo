package com.atdonglijiedian.controller;

import com.atdonglijiedian.pojo.Users;
import com.atdonglijiedian.service.UsersService;
import com.atdonglijiedian.service.impl.UsersServiceImpl;

/**
 * 界面层
 */
public class UsersController {

    public UsersService usersService = new UsersServiceImpl();

    public int insert(Users users){

        return usersService.insert(users);
    }

}
