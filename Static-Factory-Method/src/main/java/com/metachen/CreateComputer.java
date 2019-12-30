package com.metachen;

import com.metachen.base.Computer;
import com.metachen.factory.ComputerFactory;

public class CreateComputer {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer(ComputerFactory.ctype.hp);
        computer.start();
    }
}


/*
* 优点：
* 1. 免除直接创建对象的责任
* 2. 客户端无须知道所创建的具体产品类的类名，只需要知道具体产品类所对应的参数
*
* 缺点：
* 1. 由于工厂类集中了所有产品创建逻辑，一旦不能正常工作，整个系统都要受到影响。
* 2. 系统扩展困难，一旦添加新产品就不得不修改工厂逻辑，同样破坏了“开闭原则”；在产品类型较多时，
*    有可能造成工厂逻辑过于复杂，不利于系统的扩展和维护。
* */