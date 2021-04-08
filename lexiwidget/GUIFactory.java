package lexiwidget;

import lexi.Compositor;

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

    public final Button createButton(Compositor compositor) {
        return buttonFactoryMethod(compositor);
    }

    public final Label createLabel(Compositor compositor) {
        return labelFactoryMethod(compositor);
    }
    
    // these are the factory methods that will be made concrete in the subclasses
    protected abstract Label labelFactoryMethod(Compositor compositor);
    protected abstract Button buttonFactoryMethod(Compositor compositor);

}