package com.metachen.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("1.jpg");

        // 由磁盘加载图片
        image.display();

        // 不需要加载
        image.display();
    }
}
