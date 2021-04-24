package lexicommand;

import java.util.ArrayList;

// Prototype(117): Client

public class CommandHistory {

    private static CommandHistory single = null;
    protected ArrayList<Command> history;
    private int nextIndex = 0;

    private CommandHistory() {
        history = new ArrayList<Command>();
    }

    public static CommandHistory instance() {
        if (single == null) {
            single = new CommandHistory();
        }
        return single;
    }

    public void add(Command command) {
        if (nextIndex < history.size()) {
            ArrayList <Command> truncated = new ArrayList<Command>();
            int limit = nextIndex - 1; 
            for(int i=0; i<limit; i++) {
                truncated.add(history.get(i));
            }
            history.clear();
            history = truncated;
        }
        history.add(command);
        nextIndex++;
        System.out.println("added " + command.shortcut + " at index " + (nextIndex-1));
        System.out.println(nextIndex-1);
    }

    public Command undo() {
        if (nextIndex > 0) {
            Command undone = history.get(nextIndex - 1);
            nextIndex--;
            return undone;
        }
        return null;
    }

    public Command redo() {
        if (nextIndex < history.size()) {
            Command redone = history.get(nextIndex);
            nextIndex++;
            return redone;
        }
        return null;
    }
}