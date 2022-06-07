package com.atguigu;

public class 事务笔记 {
    /**
     * Spring的两种事务处理方式
     * 1）注解式的事务 @Transactional
     *      此注解可添加到类上，则对类中所有方法执行事务的设定
     *      此注解可添加到方法上，只是对此方法执行事务的处理
     * 2）声明式的事务
     *      在配置文件中添加一次，正哥项目遵循事务的决定
     *
     * Spring中事务的五大隔离级别
     *   1).未提交读(Read Uncommitted)：允许脏读，也就是可能读取到其他会话中未提交事务修改的数据
     *   2).提交读(Read Committed)：只能读取到已经提交的数据。Oracle等多数数据库默认都是该级别 (不重复读)
     *   3).可重复读(Repeated Read)：可重复读。在同一个事务内的查询都是事务开始时刻一致的，InnoDB默认级别。在SQL标准中，该隔离级别消除了不可重复读，但是还存在幻象读，但是innoDB解决了幻读
     *   4).串行读(Serializable)：完全串行化的读，每次读都需要获得表级共享锁，读写相互都会阻塞
     *   5).使用数据库默认的隔离级别isolation = Isolation.DEFAULT
     *     MySQL：mysql默认的事务处理级别是'REPEATABLE-READ',也就是可重复读
     *     Oracle：oracle数据库支持READ COMMITTED 和 SERIALIZABLE这两种事务隔离级别。默认系统事务隔离级别是READ COMMITTED,也就是读已提交
     *
     * 为什么添加事务管理器
     *   JDBC:  Connection   con.commit();   con.rollback();
     *   MyBatis:  SqlSession   sqlSession.commit();  sqlSession.rollback();
     *   Hibernate:  Session    session.commit();   session.rollback();
     *
     *   事务管理器用来生成相应技术的连接+执行语句的对象.
     *   如果使用MyBatis框架,必须使用DataSourceTransactionManager类完成处理
     *      <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
     *         <!--因为事务必须关联数据库处理,所以要配置数据源-->
     *         <property name="dataSource" ref="dataSource"></property>
     *      </bean>
     *
     *Spring事务的传播特性
     *   多个事务之间的合并,互斥等都可以通过设置事务的传播特性来解决.
     *   常用
     *   PROPAGATION_REQUIRED：必被包含事务(增删改必用)
     *   PROPAGATION_REQUIRES_NEW：自己新开事务，不管之前是否有事务
     *   PROPAGATION_SUPPORTS：支持事务，如果加入的方法有事务，则支持事务，如果没有，不单开事务
     *   PROPAGATION_NEVER：不能运行在事务中，如果包在事务中，抛异常
     *   PROPAGATION_NOT_SUPPORTED：不支持事务，运行在非事务的环境
     *   不常用
     *   PROPAGATION_MANDATORY：必须包在事务中，没有事务则抛异常
     *   PROPAGATION_NESTED：嵌套事务
     *
     */
}
