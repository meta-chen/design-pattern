package com.metachen.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    /**
     * 因为需要处理真实角色，所以要把真实角色传进来
     */
    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *
     * @param proxy    代理类
     * @param method    正在调用的方法
     * @param args      方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if(method.getName().equals("sellBook")){
            int invoke = (Integer) method.invoke(realSubject,args);
            System.out.println("调用卖书的方法");
            return invoke;
        }
        else{
            String name = (String)method.invoke(realSubject,args);
            System.out.println(name+"在说话");
            return name;
        }
    }
}
