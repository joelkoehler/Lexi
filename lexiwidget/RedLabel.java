package lexiwidget;

import java.awt.Point;
import lexi.Compositor;
import java.util.ArrayList;
import lexi.Glyph;
import lexiwindow.Window;

public class RedLabel extends Label {
    
    protected RedLabel(Compositor compositor) {
        //super(content);
        setParent(null);
        getBounds().setDims(0,0);
        getBounds().point().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window) {

        getChild().draw(window);
        window.drawLabel(
            getChild().getBounds().point().x, 
            getChild().getBounds().point().y , 
            getChild().getBounds().width()+3 ,
            getChild().getBounds().height()+3, 
            "red");
    }

    public void setSize(Window window) {
        //do nothing.
    }

}
