package com.atguigu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @SpringBootApplication
 * 符合注解：由
 * @SpringBootConfiguration 可以使用Bean声明对象，注入到容器
 * @EnableAutoConfiguration 启用自动配置， 把java对象配置好，注入到spring容器中。例如可以把mybatis的对象创建好，放入到容器中
 * @ComponentScan 扫描器，找到注解，根据注解的功能创建对象，给属性赋值等等。
 *                默认扫描的包： @ComponentScan所在的类所在的包和子包。
 */

/**
 * @EnableTransactionManagement： 启用事务管理器
 * @EnableDubbo：启用dubbo配置
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.atguigu.dao"})
@EnableTransactionManagement
//@EnableDubbo
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
