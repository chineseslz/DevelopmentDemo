package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface SQLMapper {

    /**
     * 模糊查询
     * @param username
     * @return
     */
    List<User> getUserByLike(String username);

    /**
     * 批量删除
     */
    int deleteMore(String ids);

}
