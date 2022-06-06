package com.atdonglijiedian.dao;

import com.atdonglijiedian.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * 数据访问层的实现类
 */
@Repository
public class UsersMapperImpl implements UsersMapper {
    @Override
    public int insert(Users users) {
        return 1;
    }
}
