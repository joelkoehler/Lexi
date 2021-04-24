package lexiwidget;

import lexi.Compositor;
import lexi.Glyph;
import lexicommand.Command;

public class GreenFactory extends GUIFactory {

    private GreenFactory() {
        //TODO
    }

    public static GreenFactory instance() {
        return new GreenFactory();
    }

    protected Label labelFactoryMethod(Compositor compositor, Glyph content) {
        return new GreenLabel(compositor, content);
    }

    protected Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command) {
        return new GreenButton(compositor, content, command);
    }

}
