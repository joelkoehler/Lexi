package lexiwidget;

import lexi.Compositor;

public class RedFactory extends GUIFactory {

    private RedFactory() {
        //TODO
    }

    public static RedFactory instance() {
        return new RedFactory();
    }

    protected Label labelFactoryMethod(Compositor compositor) {
        return new RedLabel(compositor);
    }

    protected Button buttonFactoryMethod(Compositor compositor) {
        return new RedButton(compositor);
    }

}
