package lexiwindow;

import lexi.Glyph;

// Bridge(151): Abstraction

public abstract class Window {

    protected WindowImp imp;
    private Glyph root = null;

    public void drawCharacter(char c, int x, int y) {
        imp.drawCharacter(c, x, y);
    }

    public void drawRectangle(int x, int y, int width, int height) {
        imp.drawRectangle(x, y, width, height);
    }

    public int charWidth(char c) {
        return imp.charWidth(c);
    }

    public int charHeight(char c) {
        return imp.charHeight(c);
    }

    public void setContents(Glyph root) {
        this.root = root;
        imp.setContents();
    }
    
    public void addBorder(int x1, int y1, int x2, int y2, int width) {
        imp.addBorder(x1, y1, x2, y2, width);
    }
    public void addScrollBar(int x, int y, int width, int height) {
        imp.addScrollBar(x, y, width, height);
    }

    public void drawButton(int x, int y, int width, int height, String color) {
        imp.drawButton(x, y, width, height, color);
    }
    public void drawLabel(int x, int y, int width, int height, String color) {
        imp.drawLabel(x, y, width, height, color);
    }

    public void draw() {
        if (root != null) {
            root.draw(this);
        }
    }
}
