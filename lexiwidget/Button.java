package lexiwidget;

import lexi.Embellishment;
import lexi.*;
import lexiwindow.Window;



public abstract class Button extends Embellishment {

	// public Button(Glyph content) {
	// 	super(content);
	// }

    //public abstract void Press();
    public abstract void draw(Window window);
    public abstract void setSize(Window window);

}
