package com.atguigu.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/redis")
public class RedisController {

    //注入RedisTemplate
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    //添加数据
    @PostMapping("/addstring")
    public String addToRedis(String name,String value){
        //操作String类型
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("myname","slz");
        return "添加string类型的数据";
    }

    //获取数据
    @GetMapping("/getk")
    public String getData(String k){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(k);
        return "key-"+k+",value-"+v;
    }

    @PostMapping("/{k}/{v}")
    public String addStringKV(@PathVariable String k,@PathVariable String v){
        stringRedisTemplate.opsForValue().set(k,v);
        return "使用StringRedisTemplate对象";
    }

    //获取数据
    @GetMapping("/getstr/{k}")
    public String getStringValue(@PathVariable String k){
        String v = stringRedisTemplate.opsForValue().get(k);
        return "k的value-"+v;
    }

}
