package lexiwidget;

import lexi.Embellishment;

public abstract class Button extends Embellishment {

    public abstract void Press();
    public abstract void draw(Window window);
    public abstract void adjustSize();

}
