package lexiwindow;

// Bridge(151): RefinedAbstraction

public class ApplicationWindow extends Window {

    public ApplicationWindow(String title) {
        imp = WindowFactory.instance().createWindowImp(title, this);
    }

}
