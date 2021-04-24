package lexiwidget;

import java.awt.Point;
import lexi.Compositor;
import java.util.ArrayList;
import lexi.Glyph;
import lexicommand.Command;
import lexiwindow.Window;


public class GreenButton extends Button {

    protected GreenButton(Compositor compositor, Glyph content, Command command) {
        super(content, command);
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
            "green");
        getChild().draw(window);
    }

    public void setSize(Window window) {
        //do nothing.
    }

}
