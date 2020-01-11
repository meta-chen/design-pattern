package shapeUtil;

public enum ShapePool{
    CIRCLE("shapeUtil.Circle"),
    RECTANGLE("shapeUtil.Rectangle"),
    SQUARE("shapeUtil.Square");
    private String text;
    ShapePool(String square) {
        this.text = square;
    }

    public String getText() {
        return text;
    }
}
