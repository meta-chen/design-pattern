package abstractFactory;

import colorUtil.Color;
import shapeUtil.Shape;

import java.lang.reflect.Constructor;

public class ColorFactory extends AbstractFactory {
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color){
        Color instance = null;
        try{
            Class clazz = Class.forName(color);
            Constructor constructor = clazz.getConstructor();
            instance = (Color) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
