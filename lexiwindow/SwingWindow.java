package lexiwindow;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Bridge(151): ConcreteImplementorA
// AbstractFactory(87): ProductA1
// FactoryMethod(107): ConcreteProduct

class SwingWindow implements WindowImp {

    private final int width=200;
    private final int height=200;

    private Window _window;
    private Pane _pane;
    private JFrame _jFrame;
    private Color _color;
    private Graphics _graphics;
    private Font _font=null;
    private FontMetrics _fm;

    private class PaneKeyListener implements KeyListener {
	public void keyTyped(KeyEvent e) {
	    _window.key(e.getKeyChar());
	}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
    }

    private class PaneMouseListener implements MouseListener {
	public void mouseClicked(MouseEvent e) {
	    _window.click(e.getX(),e.getY());
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
    }

    private class Pane extends JPanel {

	public void paintComponent(Graphics graphics) {
	    super.paintComponent(graphics);
	    _graphics=graphics;
	    if (_font!=null) {
		_graphics.setFont(_font);
		_fm=_graphics.getFontMetrics();
	    }
	    _window.draw();
	}

    }

    public SwingWindow(String title, Window window) {
	_window=window;
	JFrame.setDefaultLookAndFeelDecorated(true);
	_jFrame=new JFrame(title);
	_jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	_jFrame.setJMenuBar(new JMenuBar());
	_jFrame.setSize(width,height);
	_jFrame.setVisible(true);
	_fm=_jFrame.getGraphics().getFontMetrics();
	_color=_jFrame.getGraphics().getColor();
    }

    public int charWidth(char c) {
	return _fm.charWidth(c);
    }

    public int charHeight(char c) {
	return _fm.getHeight();
    }

    private int charBaseline(char c) {
	return _fm.getLeading()+_fm.getAscent();
    }

    public void drawCharacter(char c, int x, int y) {
	_graphics.drawString(c+"",x,y+charBaseline(c));
    }

    public void drawRectangle(int x, int y, int width, int height) {
	_graphics.drawRect(x,y,width,height);
    }

    public void setContents() {
	_pane=new Pane();
	_jFrame.setContentPane(_pane);
	_pane.addMouseListener(new PaneMouseListener());
	_pane.addKeyListener(new PaneKeyListener());
	_pane.setFocusable(true);
	_pane.requestFocusInWindow();
	_jFrame.setVisible(true);
    }

    public void addBorder(int x1, int y1, int x2, int y2, int width) {
	_graphics.fillRect(x1,y1,x2-x1,width);                     // top
	_graphics.fillRect(x1,y1+width,width,y2-y1-2*width);       // left
	_graphics.fillRect(x2-width,y1+width,width,y2-y1-2*width); // right
	_graphics.fillRect(x1,y2-width,x2-x1,width);               // bottom
    }

    public void addScrollBar(int x, int y, int width, int height) {
	_graphics.drawRect(x,y,width,height);        // bar
	_graphics.fillRect(x+2,y+2,width-3,width-3); // handle
    }

    public Color color(String c) {
	if (c.equalsIgnoreCase("red"))
	    return Color.red;
	if (c.equalsIgnoreCase("green"))
	    return Color.green;
	return _color;
    }

    public void drawButton(int x, int y, int width, int height, String color) {
	_graphics.setColor(color(color));
	_graphics.fillRect(x,y,width,height);
	_graphics.setColor(_color);
    }

    public void drawLabel(int x, int y, int width, int height, String color) {
	_graphics.setColor(color(color));
	_graphics.drawRect(x,y,width,height);
	_graphics.setColor(_color);
    }

    public int getFontSize() {
	Font font;
	if (_font!=null)
	    font=_font;
	else
	    font=_pane.getGraphics().getFont();
	return font.getSize();
    }
	
    public void setFontSize(int size) {
	if (size>0) {
	    Font font;
	    if (_font!=null)
		font=_font;
	    else
		font=_pane.getGraphics().getFont();
	    _font=new Font(font.getFamily(),font.getStyle(),size);
	    _graphics.setFont(_font);
	    _fm=_graphics.getFontMetrics();
	}
    }

    public void repaint() { _pane.repaint(); }

}
