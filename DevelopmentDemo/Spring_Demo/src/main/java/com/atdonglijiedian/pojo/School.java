package com.atdonglijiedian.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {

    @Value("南理工")
    private String name;
    @Value("秦淮区")
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
