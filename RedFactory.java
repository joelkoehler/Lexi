public class RedFactory extends GUIFactory {

    private RedFactory() {
        //TODO
    }

    public static RedFactory instance() {
        return new RedFactory();
    }

    // public Button createButton() {
    //     return new RedButton();
    // }

    // public Label createLabel() {
    //     return new RedLabel();
    // }

    protected Label labelFactoryMethod() {
        return new RedLabel();
    }

    protected Button buttonFactoryMethod() {
        return new RedButton();
    }

}
