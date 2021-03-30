package lexiwidget;

import java.awt.Point;
import lexi.Compositor;
import java.util.ArrayList;
import lexi.Glyph;
import lexi.Window;

public class GreenLabel extends Label {
    
    protected GreenLabel(Compositor compositor) {
        //super(content);
        setParent(null);
        getBounds().setDims(0,0);
        getBounds().point().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        
        getChild().draw(window); // or super.draw?
        window.drawLabel(
            getChild().getBounds().point().x, 
            getChild().getBounds().point().y , 
            getChild().getBounds().width()+3 ,
            getChild().getBounds().height()+3, 
            "green");
    }

    public void setSize(Window window) {
        //do nothing.
    }

}
