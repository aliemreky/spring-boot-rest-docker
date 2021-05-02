package com.spring.project.docker.springdocker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Service
public class FooService {

    private Logger LOGGER = LoggerFactory.getLogger(FooService.class);

    @Autowired
    RedisTemplate<String, Serializable> template;

    public Map<String, String> welcomeDocker() {

        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("Message", "Hello World Docker");

        return returnMap;
    }

    public Map<String, String> welcomeDockerRedis() {

        Integer count = (Integer) template.opsForValue().get("count");

        LOGGER.info("redis count value : " + count);

        if (count == null) {
            template.opsForValue().set("count", 1);
            count = 1;
        } else {
            count++;
            template.opsForValue().set("count", count);
        }

        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("Message", "Hello World Docker & Redis");
        returnMap.put("Redis Cache", "count value : " + count);

        return returnMap;
    }
}
