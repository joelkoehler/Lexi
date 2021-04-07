public class AwtWindowFactory extends WindowFactory {

    private AwtWindowFactory() {
        //TODO
    }

    public static AwtWindowFactory instance() {
        return new AwtWindowFactory();
    }

    // protected Label labelFactoryMethod(Compositor compositor) {
    //     return new RedLabel(compositor);
    // }

    // protected Button buttonFactoryMethod(Compositor compositor) {
    //     return new RedButton(compositor);
    // }

}
