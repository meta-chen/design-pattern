package colorUtil;

public enum ColorPool {
    BLUE("colorUtil.Blue"),GREEN("colorUtil.Green"),RED("colorUtil.Red");
    private String text;
    ColorPool(String s) {
        this.text = s;
    }

    public String getText() {
        return text;
    }
}