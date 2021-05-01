package com.spring.project.docker.springdocker.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FooService {

    public Map<String, String> welcomeDocker() {

        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("Message", "Hello World Docker");

        return returnMap;
    }
}
