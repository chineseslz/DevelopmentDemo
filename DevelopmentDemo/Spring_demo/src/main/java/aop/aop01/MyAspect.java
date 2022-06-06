package aop.aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 切面类，切面方法
 */
@Aspect
@Component
public class MyAspect {

    //    @Before(value = "execution(public String aop.aop01.SomeServiceImpl.doSome(String,int))")
//    public void myBefore(JoinPoint joinPoint){
//        System.out.println("前置通知。。。");
//        System.out.println("目标方法的签名："+joinPoint.getSignature());
//        System.out.println("目标方法的参数："+ Arrays.asList(joinPoint.getArgs()));
//    }
    @AfterReturning(value = "execution(public Student aop.aop01.SomeServiceImpl.change())", returning = "object")
    public void myAfterReturning(Object object) {
        System.out.println("后置通知。。。");
        if (object != null) {
            if (object instanceof Student) {
                Student stu = (Student) object;
                stu.setName("lz");
            }
        }
    }

//    @Around(value = "execution(* aop.aop01.SomeServiceImpl.doSome(..))")
//    public Object myAround(ProceedingJoinPoint pip) throws Throwable {
//        System.out.println("环绕通知。。。");
//        Object object = pip.proceed(pip.getArgs());
//        return object.toString().toUpperCase();
//    }

    @After(value = "execution(* aop.aop01.SomeServiceImpl.doSome(..))")
    public void myAfter() {
        System.out.println("最终通知...");
    }


}
