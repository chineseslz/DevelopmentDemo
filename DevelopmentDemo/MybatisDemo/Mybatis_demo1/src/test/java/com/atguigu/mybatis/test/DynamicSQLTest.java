package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *动态SQL：
 * 1、if：根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
 *  2、where：
 *  当标签中有内容时，会自动生成where关键字，并且将内容前多余的and或or去掉
 *  当标签中没有内容时，此时标签没有任何效果
 *  3、trim：
 *  prefix：将trim标签中所有内容前面添加指定内容
 *  suffix：将trim标签中所有内容后面添加指定内容
 *  prefixOverrides：将trim标签中所有内容前面去掉指定内容
 *  suffixOverrides：将trim标签中所有内容后面去掉指定内容
 *  若标签中没有内容时：trim标签没有任何效果
 *  4、choose、when、otherwise  相当于if...elseif...else
 *  5、foreach：批量操作
 *  collection：设置需要循环的数组或集合
 *  item：表示数组或集合中的每一个数据
 *  separator：循环体之间的分隔符
 *  open:foreach：标签所循环的所有内容的开始符
 *  close:foreach标签所循环的所有内容的结束符
 *  6、SQL标签
 *  设置SQL片段：<sql id="empColumns">eid,empName,age,sex,email</sql>
 *  引用SQL片段：<include refid="empColumns"></include>
 */


public class DynamicSQLTest {

    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

    @Test
    public void insertMoreByList(){
        Emp emp1 =new Emp(null,"a",23,"男","sad@123.qq.com");
        Emp emp2 =new Emp(null,"545",25,"女","sad@123.qq.com");
        Emp emp3 =new Emp(null,"爱的",26,"男","sad@123.qq.com");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        int result = mapper.insertMoreByList(list);
        System.out.println(result);
    }

    @Test
    public void deleteMoreByArray(){
        int result = mapper.deleteMoreByArray(new Integer[]{2,3,4});
        System.out.println(result);
    }


    @Test
    public void getEmpByChoose(){
        List<Emp> list = mapper.getEmpByCondition(new Emp(null,"sss",null,"",""));
        System.out.println(list);

    }
}
