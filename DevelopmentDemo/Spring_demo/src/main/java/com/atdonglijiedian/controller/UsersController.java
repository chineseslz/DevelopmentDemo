package com.atdonglijiedian.controller;

import com.atdonglijiedian.pojo.Users;
import com.atdonglijiedian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 界面层
 */
@Controller
public class UsersController {

    @Autowired
    public UsersService usersService ;

    public int insert(Users users){

        return usersService.insert(users);
    }

}
