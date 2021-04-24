package lexicommand;

import lexiwindow.Window;

public class UndoCommand extends Command {
    
    public UndoCommand(String shortcut) {
        super(shortcut);
        undoable = false;
    }

    public void execute(Window window) {
        // TODO Auto-generated method stub
        Command undone = CommandHistory.instance().undo();
        if(undone != null) {
            undone.unexecute(window);
        }
    }

    public void unexecute(Window window) {
        // Do nothing.
    }

    public Command cloneCommand() {
        return new UndoCommand(shortcut);
    }

}
