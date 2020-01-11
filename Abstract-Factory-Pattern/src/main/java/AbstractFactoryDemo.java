import abstractFactory.AbstractFactory;
import abstractFactory.Factories;
import abstractFactory.FactoryProducer;
import colorUtil.Color;
import colorUtil.ColorPool;
import shapeUtil.Shape;
import shapeUtil.ShapePool;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        // 新建一个工厂类的工厂类
        FactoryProducer producer = new FactoryProducer();
        // 为各个模块创建工厂类
        AbstractFactory color = producer.getFactory(Factories.COLORFACTORY.getText());
        AbstractFactory shape = producer.getFactory(Factories.SHAPEFACTORY.getText());
        Color c = color.getColor(ColorPool.GREEN.getText());
        c.fill();
        Shape s = shape.getShape(ShapePool.RECTANGLE.getText());
        s.draw();
    }
}


/*
* 抽象工厂与工厂模式与简单工厂模式
* 三者的创建对象是不相同的。
* 进行创建对象时,“工厂模式”不使用new创建对象,而是使用Factory模式;
* “简单工厂模式”则是通过fw模式来建立对象;
* “抽象工厂模式”使用迭代模式来创建对象。
* */