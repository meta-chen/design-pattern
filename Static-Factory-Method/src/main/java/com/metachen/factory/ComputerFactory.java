package com.metachen.factory;

import com.metachen.base.AsusComputer;
import com.metachen.base.Computer;
import com.metachen.base.HpComputer;
import com.metachen.base.LenovoComputer;

// 简单工厂模式
public class ComputerFactory {

    public enum ctype {hp,lenovo,asus}

    public static Computer createComputer(ctype type) {
        /*简单工厂模式通过这种做法实现了对责任的分割，它提供了专门的工厂类用于创建对象*/
        Computer computer = null;
        switch (type){
            case hp:
                computer = new HpComputer();
                break;
            case lenovo:
                computer = new LenovoComputer();
                break;
            case asus:
                computer = new AsusComputer();
                break;
        }
        return computer;
    }
}
