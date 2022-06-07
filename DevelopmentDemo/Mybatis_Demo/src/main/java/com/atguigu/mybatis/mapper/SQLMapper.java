package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 查询指定表中的数据
     */
    List<User> getUserByTableName(@Param("tabName") String tab);

    /**
     * 添加用户信息（自增）
     */
    void insertUser(User user);


}
