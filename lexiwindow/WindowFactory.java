package lexiwindow;

//AbstractFactory(87): AbstractFactory
//FactoryMethod(107): Creator
//Singleton(127): Singleton

public abstract class WindowFactory {

    private static WindowFactory single = null;

    public static WindowFactory instance() {
        if (single == null) {

            String s=System.getenv("LexiWindow");
            //String s="Swing"; // had to hardcode this to get it to work

            if (s!=null && s.equals("Swing")) {
                single = SwingWindowFactory.instance();
            }
            else if (s!=null && s.equals("Awt")) {
                single = AwtWindowFactory.instance();
            }
        }
        return single;
    }

    public final WindowImp createWindowImp(String title, Window window) {
        return createWindowImpFactoryMethod(title, window);
    }

    protected abstract WindowImp createWindowImpFactoryMethod(String title, Window window);

}
