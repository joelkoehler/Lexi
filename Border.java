import java.awt.Point;
import java.util.ArrayList;


public class Border extends Embellishment {
    
    private int thickness;

    public Border (Compositor compositor, int thickness) {
        this.thickness = thickness;

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
        window.addBorder(
            getChild().getBounds().point().x, 
            getChild().getBounds().point().y , 
            getChild().getBounds().point().x + getChild().getBounds().width()+3 ,
            getChild().getBounds().point().y + getChild().getBounds().height()+3, 
            thickness);
    }

}
