package lexicommand;
import lexiwindow.Window;

// Command(223): ConcreteCommand

public class SetFontSizeCommand extends Command {

    private int previousSize;
    private int size;

    public SetFontSizeCommand(String shortcut, int size) {
		super(shortcut);
        this.size = size;
		undoable = true;
		previousSize = 8;
    }

    public void execute(Window window) {
        this.size = size++;
        //CommandHistory.instance().add(cloneCommand());
    }

    public void unexecute(Window window) {
        size = previousSize;
    }

    public Command cloneCommand() {
        SetFontSizeCommand copy = new SetFontSizeCommand(shortcut, size);
        return copy;
    }

}