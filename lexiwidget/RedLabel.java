package lexiwidget;

import java.awt.Point;

import lexi.Window;

public class RedLabel extends Label {
    
    public RedLabel() {
        setParent(null);
        getBounds().setDims(0, 0);
        getBounds().point().setLocation(new Point(0,0));
    }

    @Override
    public void draw(Window window) {
        // TODO Auto-generated method stub
        super.draw(window);
    }

}
