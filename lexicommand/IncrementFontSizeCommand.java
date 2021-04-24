package lexicommand;

import lexiwindow.Window;

public class IncrementFontSizeCommand extends Command {
    
    public IncrementFontSizeCommand(String shortcut) {
        super(shortcut);
        undoable = true;
    }

    public void execute(Window window) {
        window.setFontSize(window.getFontSize()+1);
        //CommandHistory.instance().add(cloneCommand());
        CommandHistory history = CommandHistory.instance();
        if (history == null) {
            System.out.println("empty");
        }
        //history.add(cloneCommand());
        System.out.println("font size = " + window.getFontSize());
    }

    public void unexecute(Window window) {
		window.setFontSize(window.getFontSize()-1);
        System.out.println("font size = " + window.getFontSize());
    }

    public Command cloneCommand() {
        return new IncrementFontSizeCommand(shortcut);
    }

}
