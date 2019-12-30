package com.metachen.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // 真实对象
        Subject subject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(subject);

        // 获取代理对象
        Subject instance = (Subject) Proxy.newProxyInstance(myInvocationHandler.getClass().getClassLoader(), subject.getClass().getInterfaces(), myInvocationHandler);
        instance.sellBook();
        instance.speak();

    }
}
