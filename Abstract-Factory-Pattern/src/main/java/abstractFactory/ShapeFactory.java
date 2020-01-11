package abstractFactory;

import colorUtil.Color;
import shapeUtil.Shape;

import java.lang.reflect.Constructor;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shape){
        Shape shape1 = null;
        try{
            Class clazz = Class.forName(shape);
            Constructor constructor = clazz.getConstructor();
            shape1 = (Shape) constructor.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return shape1;
    }

    public Color getColor(String color) {
        return null;
    }
}
