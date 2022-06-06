package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getAgent(Service target,AOP aop){
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的所有接口
                target.getClass().getInterfaces(),
                //代理功能实现
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //生成的代理对象,
                        //Object proxy,
                        //正在被调用的目标方法bug(),show()
                        //Method method,
                        //目标方法的参数
                        //Object[] args
                        Object obj = null;
                        try {
                            aop.before();
                            obj = method.invoke(target,args);
                            aop.after();
                        } catch (Exception e) {
                            aop.exception();
                        }
                        return obj;
                    }

                }
        );
    }

}
