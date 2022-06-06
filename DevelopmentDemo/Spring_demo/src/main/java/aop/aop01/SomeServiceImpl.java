package aop.aop01;

import org.springframework.stereotype.Service;

/**
 * 业务实现类
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome被执行。。。");
        return "abcd";
    }

    @Override
    public Student change() {
        return new Student("slz");
    }
}
