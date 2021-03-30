package lexiwidget;

import lexi.Embellishment;
import lexi.Window;
import lexi.*;


public abstract class Button extends Embellishment {

	// public Button(Glyph content) {
	// 	super(content);
	// }

    //public abstract void Press();
    public abstract void draw(Window window);
    public abstract void setSize(Window window);

}
