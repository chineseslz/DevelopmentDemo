package aop.aop01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面类，切面方法
 */
@Aspect
public class MyAspect {

    @Before(value = "execution(public String aop.aop01.SomeServiceImpl.doSome(String,int))")
    public void myBefore(){
        System.out.println("前置通知。。。");
    }
}
