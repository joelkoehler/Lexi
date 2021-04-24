package lexicommand;

import lexiwindow.Window;

public class DecrementFontSizeCommand extends Command {

    public DecrementFontSizeCommand(String shortcut) {
        super(shortcut);
        undoable = true;
    }

    public void execute(Window window) {
        window.setFontSize(window.getFontSize()-1);
        System.out.println("font size = " + window.getFontSize());
    }

    public void unexecute(Window window) {
		window.setFontSize(window.getFontSize()+1);
        System.out.println("font size = " + window.getFontSize());
    }

    public Command cloneCommand() {
        return new DecrementFontSizeCommand(shortcut);
    }
    
}
