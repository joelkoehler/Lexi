package lexiwidget;

import java.awt.Point;
import lexi.Compositor;
import java.util.ArrayList;
import lexi.Glyph;
import lexiwindow.Window;

public class RedButton extends Button {

    protected RedButton(Compositor compositor) {
        //super(content);
        setParent(null);
        getBounds().setDims(0,0);
        getBounds().point().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        
        window.drawButton(
            getChild().getBounds().point().x, 
            getChild().getBounds().point().y , 
            getChild().getBounds().width()+3 ,
            getChild().getBounds().height()+3, 
            "red");
        getChild().draw(window);
    }

    public void setSize(Window window) {
        //do nothing.
    }
}
