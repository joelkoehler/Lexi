package lexi;
import java.awt.Point;
import javax.naming.OperationNotSupportedException;

import lexiwindow.Window;

import java.util.ArrayList;

public class Column extends Composition {

    public Column(Compositor compositor) {
        setParent(null);
        getBounds().setDims(0,0);
        Point point = new Point(0,0);
        getBounds().point().setLocation(point);
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        super.draw(window);
    }

    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        return super.child(position);
    }

    public void setSize(Window window) {
        int width = 0;
        int height = 0;

        Glyph child = getChildren().get(0);
        try {
            for(int i = 1; i > -1; i++) {
                width = Math.max(width, child.getBounds().width());
                height += child.getBounds().height(); 
                child = this.child(i);
            }
        }
        catch (Exception e) {
            getBounds().setDims(width, height);
        }
    }
    
    public void setPosition(int x, int y) {
        getBounds().point().setLocation(x, y);
    }

    public Point moveCursor(Point cursor, Glyph child) {
        cursor.y = child.getBounds().point().y + child.getBounds().height();
        return cursor;
    }

    public void adjustBounds(Point cursor) {
        getBounds().setDims(getBounds().width(), cursor.y - getBounds().point().y);
    }

}
