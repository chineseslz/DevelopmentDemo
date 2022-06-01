package com.atdonglijiedian.test;

import com.atdonglijiedian.controller.UsersController;
import com.atdonglijiedian.pojo.Users;
import org.junit.Test;

public class UsersTest {
    @Test
    public static void main(String[] args) {

        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(1,"asd",18));
        System.out.println(num);

    }
}
