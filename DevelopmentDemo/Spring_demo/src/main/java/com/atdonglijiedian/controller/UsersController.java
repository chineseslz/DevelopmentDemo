package com.atdonglijiedian.controller;

import com.atdonglijiedian.pojo.Users;
import com.atdonglijiedian.service.UsersService;

/**
 * 界面层
 */
public class UsersController {

    public UsersService usersService ;

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    public int insert(Users users){

        return usersService.insert(users);
    }

}
