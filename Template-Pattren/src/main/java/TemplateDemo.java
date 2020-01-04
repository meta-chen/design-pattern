public class TemplateDemo {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        System.out.println("---------");
        Game football = new Football();
        football.play();
    }
}


/*
* 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
*
* */