package com.atdonglijiedian.test.aop01;

import aop.aop01.SomeService;
import aop.aop01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public  void testMain() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop01/aop01.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
//        System.out.println(someService.doSome("slz",23));
        Student stu = someService.change();
        System.out.println(stu);
    }
}
