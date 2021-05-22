package model;

public class FlagStrip {

    private final int width;
    private final String color;


    public FlagStrip(String color, int width) {
        this.color = color;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
