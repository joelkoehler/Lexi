package lexiwidget;

import lexi.Compositor;
import lexi.Glyph;
import lexicommand.Command;

// this is the abstract factory
public abstract class GUIFactory {

    private static GUIFactory single = null;

    // this method enforces the singleton pattern
    public static GUIFactory instance()
    {
        if (single == null) {

            String s=System.getenv("LexiWidget"); // NOTE: had to use line below instead for testing!!
            //String s="Red"; // had to hardcode this to get it to work

            if (s!=null && s.equals("Green")) {
                single = GreenFactory.instance();
            }
            else if (s!=null && s.equals("Red")) {
                single = RedFactory.instance();
            }
        }
        return single;
    }

    public final Button createButton(Compositor compositor, Glyph content, Command command) {
        return buttonFactoryMethod(compositor, content, command);
    }

    public final Label createLabel(Compositor compositor, Glyph content) {
        return labelFactoryMethod(compositor, content);
    }
    
    // these are the factory methods that will be made concrete in the subclasses
    protected abstract Label labelFactoryMethod(Compositor compositor, Glyph content);
    protected abstract Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command);

}