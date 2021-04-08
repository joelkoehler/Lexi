package lexiwindow;

//Bridge(151): creates a ConcreteImplementor
//AbstractFactory(87): ConcreteFactory2
//FactoryMethod(107): ConcreteCreator


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
