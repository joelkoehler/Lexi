package lexiwidget;

import lexi.Embellishment;
import lexi.Window;

public abstract class Label extends Embellishment {

    // public Label(Glyph content) {
    //     super(content);
    // }
    
    public abstract void draw(Window window);
    public abstract void setSize(Window window);

}
