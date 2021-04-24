package lexicommand;

import java.util.*;

public class KeyMap {

    private Map<String,Command> map=new HashMap<String,Command>();

    public Command get(char c) {
	    return map.get(c+"");
    }

    public void put(char c, Command command) {
	    map.put(c+"",command);
    }

}
