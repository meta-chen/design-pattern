public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.draw();
    }
}


/*
* 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口
* 为复杂的子类提供一个外包装，将复杂的调用交给单独的类，为用户提供一个简单入口
*
* */