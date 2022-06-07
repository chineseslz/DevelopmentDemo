package aop;

public class ProductServiceImpl implements Service {

    @Override
    public void buy() {
        System.out.println("商品购买业务功能实现...");
    }
}
