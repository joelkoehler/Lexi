import javax.naming.OperationNotSupportedException;
import java.awt.Point;

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(new Point(0,0), 0 ,0);

    public abstract void draw(Window window);
    public Bounds getBounds() {
        return bounds;
    }
    public boolean intersects(Point point) {
        return bounds.point().equals(point);
    }

    // inserts a glyph at a position specified by an integer index.
    public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    } 

    // removes a specified glyph if it is indeed a child. 
    public void remove(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    }
    

    // returns the child (if any) at the given index
    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    } 

    // returns a reference tothe parent, if any
    public Glyph getParent() {
        return parent;
    }

    public void setParent(Glyph glyph) {
        this.parent = glyph;
    }

    public void compose() {

    }

    public abstract void setSize(Window window);
    // public abstract void setPosition(int x, int y); 
    // public abstract void moveCursor(Point cursor, Glyph child);
}
