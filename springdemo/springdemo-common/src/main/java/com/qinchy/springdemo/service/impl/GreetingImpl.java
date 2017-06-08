package com.qinchy.springdemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qinchy.springdemo.service.Greeting;

/**
 * Created by Administrator on 2017/6/8.
 */
@Service
public class GreetingImpl implements Greeting {
    @Override
    public String greeting(String name) {
        return "hello:"+name;
    }
}
