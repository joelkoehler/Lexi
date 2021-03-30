package lexiwidget;

public class GreenFactory extends GUIFactory {

    private GreenFactory() {
        //TODO
    }

    public static GreenFactory instance() {
        return new GreenFactory();
    }

    protected Label labelFactoryMethod() {
        return new GreenLabel();
    }

    protected Button buttonFactoryMethod() {
        return new GreenButton();
    }

}
