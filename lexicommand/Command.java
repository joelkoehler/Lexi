package lexicommand;

import lexiwindow.Window;

// Prototype(117): Prototype
// Command(223): Command

public abstract class Command {

    String shortcut = null;
    protected boolean undoable;

    public abstract void execute(Window window);
    public abstract void unexecute(Window window);
    public abstract Command  cloneCommand();

    public Command(String shortcut) {
        this.shortcut = shortcut;
        undoable = false;
    }

    public boolean isUndoable() {
        return undoable;
    }

    public void setUndoable(boolean undoable) {
        this.undoable = undoable;
    }

    public String getShortcut() {
        return shortcut;
    }

}