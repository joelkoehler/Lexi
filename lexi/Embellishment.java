package lexi;
import java.awt.Point;

import javax.naming.OperationNotSupportedException;
import lexiwindow.Window;


public class Embellishment extends Composition {

    public Embellishment(Glyph contents) {
		super();
	}

    public void compose() {
        super.compose();        
    }

    public void draw(Window window) {
        super.draw(window);
    }

    public void insert(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {

        if (getChildren().size() == 0) { // no child yet
            this.setParent(glyph.getParent());
            getChildren().add(glyph);
            glyph.setParent(this);
        }

        // UPDATE INTERNAL STRUCTURE
        refactor();
    }

    public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        getChildren().get(0).insert(glyph, position); // forward to childs's insert
        glyph.setParent(getChildren().get(0));

        // UPDATE INTERNAL STRUCTURE
        refactor();
    }

    public void remove(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
        getChildren().get(0).remove(glyph);

        // UPDATE INTERNAL STRUCTURE
        refactor();
    }

    public Point moveCursor(Point cursor, Glyph child) {
        return cursor;
    }

    public void setSize(Window window) {
        getChildren().get(0).setSize(window);
    }

    public void adjustBounds(Point cursor) {
        getBounds().setDims(getChildren().get(0).getBounds().width(), getChildren().get(0).getBounds().height());
        getBounds().point().setLocation(getChild().getBounds().point().getLocation());
    }

    public Glyph getChild() { // utility function for getting the *single* composition that's being embellished
        return getChildren().get(0);
    }

}
