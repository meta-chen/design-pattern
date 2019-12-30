package com.metachen.dynamicproxy;

public class RealSubject implements Subject {
    public int sellBook() {
        System.out.println("卖书！");
        return 0;
    }

    public String speak() {
        System.out.println("说话");
        return "李四";
    }
}
