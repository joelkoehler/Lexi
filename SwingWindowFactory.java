public class SwingWindowFactory extends WindowFactory {

    private SwingWindowFactory() {
        //TODO
    }

    public static SwingWindowFactory instance() {
        return new SwingWindowFactory();
    }

    // protected Label labelFactoryMethod(Compositor compositor) {
    //     return new RedLabel(compositor);
    // }

    // protected Button buttonFactoryMethod(Compositor compositor) {
    //     return new RedButton(compositor);
    // }

}
