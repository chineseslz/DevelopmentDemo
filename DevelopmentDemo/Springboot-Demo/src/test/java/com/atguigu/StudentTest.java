package com.atguigu;

import com.atguigu.config.SpringConfig;
import com.atguigu.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void test(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) ac.getBean("myStudent");
//        System.out.println(student);

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student  student = (Student) ac.getBean("createStudent");
        System.out.println(student);
    }

}
