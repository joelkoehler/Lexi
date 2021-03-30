public class GreenFactory extends GUIFactory {

    private GreenFactory() {
        //TODO
    }

    public static GreenFactory instance() {
        return new GreenFactory();
    }

    // public Button createButton() {
    //     return new GreenButton();
    // }

    // public Label createLabel() {
    //     return new GreenLabel();
    // }

    protected Label labelFactoryMethod() {
        return new GreenLabel();
    }

    protected Button buttonFactoryMethod() {
        return new GreenButton();
    }

}
