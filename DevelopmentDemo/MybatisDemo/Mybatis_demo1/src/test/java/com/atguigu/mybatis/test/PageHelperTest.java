package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageHelperTest {
    /**
     *在查询功能之前使用PageHelper.startPage(int pageNum, int pageSize)开启分页功能
     * index：当前页的开始索引
     * pageNum：当前页的页码
     * pageSize：每页显示的条数
     * index = (pageNum-1)*pageSize
     *
     * 方法二使用PageInfo
     * 在查询获取list集合之后，使用PageInfo<T> pageInfo = new PageInfo<>(List<T> list, intnavigatePages)获取分页相关数据
     * list：分页之后的数据
     * navigatePages：导航分页的页码数
     *
     * pageNum：当前页的页码
     * pageSize：每页显示的条数
     * size：当前页显示的真实条数
     * total：总记录数
     * pages：总页数
     * prePage：上一页的页码
     * nextPage：下一页的页码
     * isFirstPage/isLastPage：是否为第一页/最后一页
     * hasPreviousPage/hasNextPage：是否存在上一页/下一页
     * navigatePages：导航分页的页码数
     * navigatepageNums：导航分页的页码，[1,2,3,4,5]
     *
     */


    @Test
    public static void main(String[] args) {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(2,3);
        List<Emp> list = mapper.getAllEmp();
        PageInfo<Emp> page = new PageInfo<>(list,5);
        System.out.println(page);
        list.forEach(emp -> System.out.println(emp));

    }




}
