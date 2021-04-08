
package lexiwindow;


public abstract class WindowFactory {

    private static WindowFactory single = null;

    public static WindowFactory instance() {
        if (single == null) {

            //String s=System.getenv("LexiWindow"); // NOTE: had to use line below instead for testing!!
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

    public final WindowImp createWindowImp(String title, Window window) {
        return createWindowImpFactoryMethod(title, window);
    }

    protected abstract WindowImp createWindowImpFactoryMethod(String title, Window window);

}
