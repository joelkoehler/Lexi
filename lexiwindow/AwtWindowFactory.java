package lexiwindow;


public class AwtWindowFactory extends WindowFactory {

    private AwtWindowFactory() {
        //TODO
    }

    public static AwtWindowFactory instance() {
        return new AwtWindowFactory();
    }

    protected WindowImp createWindowImpFactoryMethod(String title, Window window) {
        return new AwtWindow(title, window);
    }


}
