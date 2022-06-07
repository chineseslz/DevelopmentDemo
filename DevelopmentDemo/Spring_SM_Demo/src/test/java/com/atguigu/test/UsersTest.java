package com.atguigu.test;

import com.atguigu.pojo.Users;
import com.atguigu.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsersTest {

    @Test
    public void usersTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        int num = usersService.insert(new Users(101,"slz","123"));
        System.out.println(num);

    }

}
