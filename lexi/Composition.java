package lexi;
import java.awt.Point;
import javax.naming.OperationNotSupportedException;


public abstract class Composition extends CompositeGlyph {
    private Compositor compositor;
    public abstract Point moveCursor(Point cursor, Glyph child);
    //change bounds?

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public Compositor getCompositor() {
		return compositor;
	}

    public void draw(Window window) {
        super.draw(window);
    }

    public void refactor() {
        // RE-DRAW INTERNAL STRUCTURE
        boolean found = false;
        Glyph current = this;
        while(!found) {
            if (current.getParent() == null) { // at the root node
                found = true;
                current.compose();
            }
            else { // not at the root, progress up one level
                current = current.getParent();
            }
        }
    }

    public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        super.insert(glyph, position);

        // UPDATE INTERNAL STRUCTURE
        glyph.setParent(this);
        refactor();
    }


    public void remove(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
        super.remove(glyph);

        // UPDATE INTERNAL STRUCTURE
        refactor();
    }

    // ADD COMPOSE
    public void compose() {
        compositor.compose();
    }

    public abstract void adjustBounds(Point cursor);

}
