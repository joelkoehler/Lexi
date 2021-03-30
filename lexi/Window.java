package lexi;
public interface Window {

    void drawCharacter(char c, int x, int y);
    void drawRectangle(int x, int y, int width, int height);

    int charWidth(char c);
    int charHeight(char c);

    void setContents(Glyph glyph);

    void addBorder(int x1, int y1, int x2, int y2, int width);
    void addScrollBar(int x, int y, int width, int height);

    void drawButton(int x, int y, int width, int height, String color);
    void drawLabel(int x, int y, int width, int height, String color);

}
