package com.atguigu.dubbo.service;

import com.atguigu.dubbo.model.User;

public interface UserService {

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
