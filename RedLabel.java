import java.awt.Point;

public class RedLabel extends Label {
    
    public RedLabel() {
        setParent(null);
        getBounds().setDims(0, 0);
        getBounds().point().setLocation(new Point(0,0));
    }

}
