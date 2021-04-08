package lexi;
import java.awt.Point;
import javax.naming.OperationNotSupportedException;
import lexiwindow.Window;


public class SimpleCompositor implements Compositor {

    private Composition composition;
    private Window window;

    public SimpleCompositor(Window window) {
        this.window = window;
    }

    public void compose() {

        // create cursor based on parent
        Point cursor = composition.getBounds().point();
        boolean flag = false;
        int position = 0;
        Glyph child = null;
        Glyph origin = null;

        while(!flag) {
            try {
                if(composition.child(position) != null) {
                    child = composition.child(position);
                    if (origin == null) {
                        origin = child;
                    }
                    // ask (leaf) child to set size, based on window
                    child.setSize(window); 
                    // ask (leaf) child to set position, based on cursor
                    child.getBounds().point().setLocation(cursor.x, cursor.y); 
                    // ask (leaf) child to compose itself, recursivley 
                    composition.child(position).compose();
                    // ask parent to adjust cursor, based on child
                    cursor = composition.moveCursor(cursor, child);
                }
                // ask parent to adjust itself, based on child 
                composition.adjustBounds(cursor);

                // checks if width or height has changed
                composition.setSize(window);
                // if (composition.child(position).getBounds().height() > composition.getBounds().height() ) {
                //     composition.getBounds().setDims(composition.getBounds().width(), composition.child(position).getBounds().height());
                // }
                // if (composition.child(position).getBounds().width() > composition.getBounds().width() ) {
                //     composition.getBounds().setDims(composition.child(position).getBounds().width(), composition.getBounds().height());
                // }

                // call method, pass cursor and let it adjust itself

            }
            catch (OperationNotSupportedException e) {
                System.out.println("you're bad.");
            }
            catch (IndexOutOfBoundsException e) {
                flag = true;
            }
            position++;
        }
        // For loop



        // ask parent to adjust itself, based on cursor
        if (origin != null) {
            composition.getBounds().point().setLocation(origin.getBounds().point());
        }

        // for(... child= ...) {
            // ask (leaf) child to set size, based on window
            // ask (leaf) child to set position, based on cursor
            // ask (leaf) child to compose itself, recursivley 
            // ask parent to adjust itself and cursor, based on child
        // }

    }
    public void setComposition(Composition composition) {
        this.composition = composition;
    }
}
