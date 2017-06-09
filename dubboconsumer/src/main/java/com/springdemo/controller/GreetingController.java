package com.springdemo.controller;

import com.qinchy.springdemo.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/9.
 */
@RestController
@RequestMapping("/springdemo")
public class GreetingController {

    @Autowired
    private Greeting greeting;

    @RequestMapping("/greeting/{name}")
    public String hello(@PathVariable String name){
        System.out.println(greeting);
        return greeting.greeting(name);
    }
}
