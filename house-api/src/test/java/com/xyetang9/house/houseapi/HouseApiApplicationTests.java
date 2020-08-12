package com.xyetang9.house.houseapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class HouseApiApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
     public void addObject(){
        redisTemplate.opsForZSet();
    }

}
