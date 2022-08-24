package com.sangeng.service;

import com.sangeng.entity.User;
import com.sangeng.utils.ResponseResult;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
