package abstractFactory;

public enum Factories {
    COLORFACTORY("abstractFactory.ColorFactory"),
    SHAPEFACTORY("abstractFactory.ShapeFactory");

    private String text;

    Factories(String s) {
        this.text = s;
    }

    public String getText() {
        return text;
    }
}
