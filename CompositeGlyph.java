import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

public abstract class CompositeGlyph extends Glyph {
    
    private ArrayList<Glyph> children;

    public void draw(Window window) {
        for(int i = 0; i < children.size(); i++) {
            if(children.get(i) != null) {
                children.get(i).draw(window);
            }
        }
    }
	
	public void setChildren(ArrayList<Glyph> children) {
		this.children = children;
	}
	
	public ArrayList<Glyph> getChildren() {
		return children;
	}

	public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        while(position > children.size()) { // fill missing spots with "null"
            children.add(children.size(), null);
        }
		children.add(position, glyph);
	}

	public void remove(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
        if (children.indexOf(glyph) == -1) {
            throw new IndexOutOfBoundsException("Glyph cannot be removed: is not a child");
        }
        children.remove(glyph);
    }

	public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        if(position >= children.size() || position < 0) {
            throw new IndexOutOfBoundsException("No child at position: out of bounds");
        }
        return children.get(position);
    }

}
