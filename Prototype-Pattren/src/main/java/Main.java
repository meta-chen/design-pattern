public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        shape.draw();
    }
}


/*
* 原型模式：
* 浅拷贝实现Cloneable();
* 深拷贝则需要使用通过实现 Serializable 读取二进制流，或者直接在复制的时候new新对象
*
*
* */