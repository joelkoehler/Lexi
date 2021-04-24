package lexiwidget;

import lexi.Embellishment;
import lexicommand.Command;
import lexi.*;
import lexiwindow.Window;
import java.awt.Point;

// ChainOfResponsibility(223): ConcreteHandler

public abstract class Button extends Embellishment {

    Command command = null;

	public Button(Glyph content, Command command) {
        super(content);
		this.command = command;
	}    

    public abstract void draw(Window window);
    public abstract void setSize(Window window);

    public Glyph Press() {
        return this;
    }

    public Glyph onClick(Point point) {
        if(intersects(point)) {
            System.out.println("hahah");
            return this;
        }
        else {
            return null;
        }
    }

    public Command getCommand() {
		return command;
	}

}
