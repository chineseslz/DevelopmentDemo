package aop.aop01;

/**
 * 业务实现类
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome的业务功能实现。。。。。");
        return "abcd";
    }
}
