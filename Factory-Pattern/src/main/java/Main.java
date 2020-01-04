import factor.ConcretAFactory;
import factor.ConcretBFactory;
import factor.Factory;
import product.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcretBFactory();
        Product product = factory.getProduct();
        product.output();
    }
}

/*
* 简单工厂与工厂模式的具体区别：
* 1、工厂模式不适用new直接创建对象，而是创建对应的具体工厂对象，然后调用相应的方法
* 2、工厂模式不依赖于预先定义好的变量，简单工厂模式则需要提前配置
* 3、工厂模式只能使用两到三个接口，但是简单工厂模式只能使用一个接口
*
*
* */