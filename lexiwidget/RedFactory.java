package lexiwidget;

import lexi.Compositor;
import lexi.Glyph;
import lexicommand.Command;

public class RedFactory extends GUIFactory {

    private RedFactory() {
        //TODO
    }

    public static RedFactory instance() {
        return new RedFactory();
    }

    protected Label labelFactoryMethod(Compositor compositor, Glyph content) {
        return new RedLabel(compositor, content);
    }

    protected Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command) {
        return new RedButton(compositor, content, command);
    }

}
