package aop;

/**
 * 代理对象
 */
public class Agent implements Service{

    Service target;
    AOP aop;

    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            aop.before();
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }
    }
}
