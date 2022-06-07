package com.atguigu.test;

import com.atguigu.pojo.Accounts;
import com.atguigu.service.AccountsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountsTest {

    @Test
    public void testAccounts() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        AccountsService accountsServive = (AccountsService) ac.getBean("accountsServiceImpl");
        int num = accountsServive.save(new Accounts(3, "3333", "333"));
        System.out.println(num);
    }

}
