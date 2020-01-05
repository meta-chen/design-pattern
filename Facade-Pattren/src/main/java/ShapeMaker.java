
import base.Circle;
import base.Rectangle;
import base.Shape;
import base.Square;

public class ShapeMaker {
    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeMaker() {
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void draw(){
        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
