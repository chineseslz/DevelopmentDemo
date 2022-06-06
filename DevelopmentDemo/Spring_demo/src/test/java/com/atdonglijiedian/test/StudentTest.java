package com.atdonglijiedian.test;

import com.atdonglijiedian.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextTotal.xml");
        Student stu = (Student) ac.getBean("student");
        System.out.println(stu);

    }

}

