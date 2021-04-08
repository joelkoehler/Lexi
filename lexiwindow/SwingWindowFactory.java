package lexiwindow;

//Bridge(151): creates a ConcreteImplementor
//AbstractFactory(87): ConcreteFactory1
//FactoryMethod(107): ConcreteCreator


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
