package aop;

public class TestAop {

    public static void main(String[] args) {

//        Service agent = new Agent(new BookServiceImpl(),new TransAop());
//        agent.buy();

        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(),new TransAop());
        agent.buy();
    }
}
