package com.spring.project.docker.springdocker.controller;

import com.spring.project.docker.springdocker.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FooController {

    @Autowired
    FooService fooService;

    @RequestMapping(value = "/welcome-docker", method = RequestMethod.GET)
    public Map<String, String> welcomeDockerController() {

        return fooService.welcomeDocker();
    }
}
