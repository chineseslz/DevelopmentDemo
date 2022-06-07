package aop;

public class TransAop implements AOP {
    @Override
    public void after() {
        System.out.println("事务提交...");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚...");
    }

    @Override
    public void before() {
        System.out.println("事务开启...");
    }
}
