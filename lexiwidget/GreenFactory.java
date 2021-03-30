package lexiwidget;

import lexi.Compositor;

public class GreenFactory extends GUIFactory {

    private GreenFactory() {
        //TODO
    }

    public static GreenFactory instance() {
        return new GreenFactory();
    }

    protected Label labelFactoryMethod(Compositor compositor) {
        return new GreenLabel(compositor);
    }

    protected Button buttonFactoryMethod(Compositor compositor) {
        return new GreenButton(compositor);
    }

}
