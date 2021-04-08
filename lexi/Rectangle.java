package lexi;
import java.awt.Point;
import lexiwindow.Window;


public class Rectangle extends Glyph {

    public Rectangle(int width, int height) {
        setParent(null);
        getBounds().setDims(width, height);
		getBounds().point().setLocation(new Point(0,0));
    }

    public void draw(Window window) {
        window.drawRectangle(getBounds().point().x, getBounds().point().y, getBounds().width(), getBounds().height());
    }

    public void setSize(Window window) {
        // do nothing.
    }

}
