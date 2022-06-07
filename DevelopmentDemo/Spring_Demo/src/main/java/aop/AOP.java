package aop;

public interface AOP {
    default void before(){}
    default void after(){}
    default void exception(){}
}
