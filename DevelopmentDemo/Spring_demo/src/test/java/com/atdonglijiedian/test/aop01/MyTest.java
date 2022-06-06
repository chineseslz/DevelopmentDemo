package com.atdonglijiedian.test.aop01;

import aop.aop01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop01/aop01.xml");
        SomeService someService = (SomeService) ac.getBean("someService");
        System.out.println(someService.doSome("slz",23));
    }
}
