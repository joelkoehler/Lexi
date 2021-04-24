package lexicommand;

import lexiwindow.Window;

public class RedoCommand extends Command {

    public RedoCommand(String shortcut) {
        super(shortcut);
        undoable = false;
    }

    public void execute(Window window) {
        Command redone = CommandHistory.instance().redo();
        if(redone != null) {
            redone.execute(window);
        }
    }

    public void unexecute(Window window) {
        // Do nothing
    }

    public Command cloneCommand() {
        return new RedoCommand(shortcut);
    }
    
}
