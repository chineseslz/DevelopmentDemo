package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    User getUserById(Integer id);

    Map<String,Object> getUserByIdToMap(Integer id);

    @MapKey("id")
    Map<String ,Object> getAllUserToMap();
}
