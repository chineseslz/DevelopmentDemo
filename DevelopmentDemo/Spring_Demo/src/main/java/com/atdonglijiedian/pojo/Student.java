package com.atdonglijiedian.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //交给spring创建对象，在容器启动是创建
public class Student {
    @Value("slz")
    private String name;
    @Value("23")
    private int age;

    @Autowired  //引用类型按类型注入    同源类型：1）相同类型  2）父子关系  3）接口实现关系
    @Qualifier("school")   //和注入类型的@Component注解的名字一致
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public Student() {
        System.out.println("Student的无参构造方法");
    }
}
