public abstract class GUIFactory {

    private static GUIFactory single = null;

    public static GUIFactory instance()
    {
        if (single == null) {
            String s=System.getenv("LexiWidget");
            if (s!=null && s.equals("Green")) {
                single = GreenFactory.instance();
            }
            else if (s!=null && s.equals("Red")) {
                single = RedFactory.instance();
            }
        }
        return single;
    }

    public final Button createButton() {
        return buttonFactoryMethod();
    }

    public final Label createLabel() {
        return labelFactoryMethod();
    }
    
    protected abstract Label labelFactoryMethod();
    protected abstract Button buttonFactoryMethod();

}