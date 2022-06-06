package aop;

public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("前置...日志输出");
    }
}
