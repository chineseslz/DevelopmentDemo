package com.atguigu.config;

import com.atguigu.vo.Student;
import org.springframework.context.annotation.*;

/***
 *@Configuration：表示当前类是作为配置文件使用的。就是用来配置容器的
 * 位置：在类的上面
 * Configuration这个类就相当于beans.xml
 */
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml"})
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.atguigu.vo")
public class SpringConfig {

    /**
     * 创建方法，方法的返回值是对象，在方法的上面加入@Bean
     * 方法的返回值对象就注入到容器中
     * @Bean：把对象注入到spring容器中    作用相当于<bean>  默认是方法名是id
     *
     *  @Bean的name属性，指定对象的名称（id）
     */
    @Bean(name = "createStudent")
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("slz");
        s1.setAge(26);
        s1.setSex("男");
        return s1;
    }


}
