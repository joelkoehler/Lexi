package lexiwindow;


public class SwingWindowFactory extends WindowFactory {

    private SwingWindowFactory() {
        //TODO
    }

    public static SwingWindowFactory instance() {
        return new SwingWindowFactory();
    }

    protected WindowImp createWindowImpFactoryMethod(String title, Window window) {
        return new SwingWindow(title, window);
    }

}
