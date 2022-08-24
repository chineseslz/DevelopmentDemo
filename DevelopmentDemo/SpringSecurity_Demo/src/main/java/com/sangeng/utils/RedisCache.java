package com.sangeng.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.TimeUnit;

@SuppressWarnings(value = {"unchecked","rawtypes"})
@Component
public class RedisCache {

    @Autowired
    private RedisTemplate redisTemplate;

    public <T> void setCacheObject(final String key,final T value){
        redisTemplate.opsForValue().set(key,value);
    }

    public <T> void setCacheObject(final String key, final T value, final long timeout, final TimeUnit timeUnit){
        redisTemplate.opsForValue().set(key,value,timeout,timeUnit);
    }

    public boolean expire(final String key,final long timeout){
        return expire(key,timeout,TimeUnit.SECONDS);
    }

    public boolean expire(final String key,final long timeout,final TimeUnit timeUnit){
        return redisTemplate.expire(key,timeout,timeUnit);
    }

    public <T> T getCacheObject(final String key){
        ValueOperations<String,T> operations = redisTemplate.opsForValue();
        return operations.get(key);
    }

    public boolean deleteObject(final String key){
        return redisTemplate.delete(key);
    }

    public long deleteObjects(final Collection collection){
        return redisTemplate.delete(collection);
    }

    public <T> long setCacheList(final String key, final List<T> dataList){
        Long count = redisTemplate.opsForList().rightPushAll(key,dataList);
        return count==null?0:count;
    }

    public <T> List<T> getCacheList(final String key){
        return redisTemplate.opsForList().range(key,0,-1);
    }


    public <T> BoundSetOperations<String,T> setCacheSet(final String key,final Set<T> dataSet){
        BoundSetOperations<String,T> setOperations = redisTemplate.boundSetOps(key);
        Iterator<T> it = dataSet.iterator();
        while (it.hasNext()){
            setOperations.add(it.next());
        }
        return setOperations;
    }

    public <T> Set<T> getCacheSet(final String key){
        return redisTemplate.opsForSet().members(key);
    }

    public <T> void setCacheMap(final String key, final Map<String,T> datMap){
       if(datMap != null){
           redisTemplate.opsForHash().putAll(key,datMap);
       }
    }

    public <T> Map<String,T> getCacheMap(final String key){
        return redisTemplate.opsForHash().entries(key);
    }

    public <T> void setCacheMapValue(final String key,final String hKey,final T value){
        redisTemplate.opsForHash().put(key,hKey,value);
    }

    public <T> T getCacheMapValue(final String key,final String hKey){
        HashOperations<String,String,T> opsForHash = redisTemplate.opsForHash();
        return opsForHash.get(key,hKey);
    }

    public void deleteCacheMapValue(final String key,final String hKey){
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.delete(key,hKey);
    }

    public <T> List<T> getMulitiCacheMapValue(final String key,final Collection<Object> hKeys){
        return redisTemplate.opsForHash().multiGet(key,hKeys);
    }

    public Collection<String> keys(final String pattern){
        return redisTemplate.keys(pattern);
    }


}
