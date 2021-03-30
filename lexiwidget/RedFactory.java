package lexiwidget;

public class RedFactory extends GUIFactory {

    private RedFactory() {
        //TODO
    }

    public static RedFactory instance() {
        return new RedFactory();
    }

    protected Label labelFactoryMethod() {
        return new RedLabel();
    }

    protected Button buttonFactoryMethod() {
        return new RedButton();
    }

}
