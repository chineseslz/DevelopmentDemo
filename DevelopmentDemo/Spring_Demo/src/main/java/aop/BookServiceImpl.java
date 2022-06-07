package aop;

public class BookServiceImpl implements Service {

    @Override
    public void buy() {
        System.out.println("图书购买业务功能实现...");
    }
}
