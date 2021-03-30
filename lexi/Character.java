package lexi;
import java.awt.Point;

public class Character extends Glyph {
    private char c;

    public Character(char c) {
        setParent(null);
        getBounds().setDims(0, 0);
        getBounds().point().setLocation(new Point(0,0));
        this.c = c;
    }

    public void draw(Window window) {
        window.drawCharacter(c, getBounds().point().x, getBounds().point().y);
    }

    public void setSize(Window window) {
        getBounds().setDims(window.charWidth(this.c), window.charHeight(this.c)); 
    }

}
