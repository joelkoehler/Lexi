


public abstract class WindowFactory {

    private static WindowFactory single = null;

    public static WindowFactory instance() {
        if (single == null) {

            //String s=System.getenv("LexiWidget"); // NOTE: had to use line below instead for testing!!
            String s="Swing"; // had to hardcode this to get it to work

            if (s!=null && s.equals("Swing")) {
                single = SwingWindowFactory.instance();
            }
            else if (s!=null && s.equals("Awt")) {
                single = AwtWindowFactory.instance();
            }
        }
        return single;
    }

    // public final OperationImp() {
    //     return OperationImpFactoryMethod();
    // }

    // protected abstract Window OperationImpFactoryMethod();


    // public final Button createButton(Compositor compositor) {
    //     return buttonFactoryMethod(compositor);
    // }

    // public final Label createLabel(Compositor compositor) {
    //     return labelFactoryMethod(compositor);
    // }
    
    // // these are the factory methods that will be made concrete in the subclasses
    // protected abstract Label labelFactoryMethod(Compositor compositor);
    // protected abstract Button buttonFactoryMethod(Compositor compositor);


}
