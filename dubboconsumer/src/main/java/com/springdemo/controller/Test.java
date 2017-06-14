package com.springdemo.controller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Test {

    public static void main(String[] args){
        Hello hello = new HelloImpl();
        InvocationHandler p = new MyInvocationHandle(hello);
//        Hello h = (Hello)Proxy.newProxyInstance(p.getClass().getClassLoader(),new Class[]{Hello.class},p);
        Hello h = (Hello)Proxy.newProxyInstance(p.getClass().getClassLoader(),hello.getClass().getInterfaces(),p);
        String s = h.say("test");
        System.out.println(s);
    }
}

class MyInvocationHandle implements InvocationHandler {

    private Object proxied;

    public MyInvocationHandle(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }
}

interface Hello {
    String say(String name);
}

class HelloImpl implements  Hello{
    @Override
    public String say(String name) {
        return name;
    }
}
