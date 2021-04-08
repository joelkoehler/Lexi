package lexiwindow;

public class ApplicationWindow extends Window {

    public ApplicationWindow(String title) {
        imp = WindowFactory.instance().createWindowImp(title, this);
    }

}
