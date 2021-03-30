import java.awt.Point;

public class Bounds {
    private Point upperLeft;
    private int width;
    private int height;

    public Bounds(Point upperLeft, int width, int height) {
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    public Point point() {
        return upperLeft;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public void setDims(int width, int height) {
        this.width = width;
        this.height = height;
    }   

    // remove "this" except setters

}
