public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        shape.draw();
    }
}
