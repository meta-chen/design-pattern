package abstractFactory;

import colorUtil.Color;
import shapeUtil.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
