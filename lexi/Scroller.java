package lexi;
import java.awt.Point;
import java.util.ArrayList;


public class Scroller extends Embellishment {

    private int w = 10;
    
    public Scroller (Compositor compositor) {
        super.setParent(null);
        super.getBounds().setDims(0,0);
        Point point = new Point(0,0);
        super.getBounds().point().setLocation(point);
        super.setChildren(new ArrayList<Glyph>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        super.draw(window);
        window.addScrollBar(
            getChild().getBounds().point().x + getChild().getBounds().width()+3, 
            getChild().getBounds().point().y, 
            w, 
            getChild().getBounds().height()+3);
    }

}
