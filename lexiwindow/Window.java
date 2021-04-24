package lexiwindow;

import lexi.Glyph;
import lexicommand.Command;
import lexicommand.CommandHistory;
import lexicommand.DecrementFontSizeCommand;
import lexicommand.IncrementFontSizeCommand;
import lexicommand.KeyMap;
import lexicommand.RedoCommand;
import lexicommand.UndoCommand;

import java.awt.Point;

import javax.naming.OperationNotSupportedException;

// Bridge(151): Abstraction
// Command(223): Invoker
// Command(223): Receiver
// ChainOfResponsibility(223): Client

public abstract class Window {

    protected WindowImp imp;
    private Glyph root = null;
    private KeyMap keyMap = new KeyMap();


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
        keyMap.put('i', new IncrementFontSizeCommand("Increase Font Size"));
    	keyMap.put('d', new DecrementFontSizeCommand("Decrease Font Size"));
    	keyMap.put('u', new UndoCommand("Undoing Command"));
    	keyMap.put('r', new RedoCommand("Redoing Command"));
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

    public void click(int x, int y) {
        // Point point = new Point(x,y);
        // Glyph clicked = root.onClick(point);

        // if (clicked != null) {
        //     if(clicked.getCommand().isUndoable()) {
        //         CommandHistory history = CommandHistory.instance();
        //         history.add(clicked.getCommand().cloneCommand());
        //     }
        // }
        // clicked.getCommand().execute(this);

        Glyph pressed = null;
		Glyph current = root;
		Point pt = new Point(x,y);
		while (pressed == null && current.intersects(pt)) {
			pressed = current.onClick(pt);
			Glyph parent = current;
			for (int i = 0; i >= 0; i++) {
				try {
					if (current.child(i).intersects(pt)) {
						current = current.child(i);
						break;
					}
				} catch (OperationNotSupportedException e) {
					break;
				} catch (IndexOutOfBoundsException e) {
					break;
				}
			}
			if (parent == current) {
				break;
			}
		}
		if (pressed != null) {
			System.out.println(pressed.getCommand().toString());
			Command copy = pressed.getCommand().cloneCommand();
			copy.execute(this);
			if (copy.isUndoable())
			{
				CommandHistory.instance().add(copy);
			}
			root.compose();
			imp.repaint();
			System.out.println(getFontSize());
		}
		else {
			System.out.println("not there");
		}

        System.out.println("click!");
    }

    public void key(char c) {
        System.out.println("you pressed "+ c);

        Command command = keyMap.get(c);
		if (command != null) {
			System.out.println(command.getShortcut());
			Command copy = command.cloneCommand();
			copy.execute(this);
			if (copy.isUndoable())
			{
				CommandHistory.instance().add(copy);
			}
			root.compose();
			imp.repaint();
		}
    }

    public void setFontSize(int size) {
		imp.setFontSize(size);
	}
	
	public int getFontSize() {
		return imp.getFontSize();
	}

}
