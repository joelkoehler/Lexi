import javax.naming.OperationNotSupportedException;
import lexi.*;
import lexiwidget.*;
import lexi.Character;

public class Lexi {
    
    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        Window w = new SwingWindow("Lexi");
        SimpleCompositor sc1 = new SimpleCompositor(w);
        SimpleCompositor sc2 = new SimpleCompositor(w);
        SimpleCompositor sc3 = new SimpleCompositor(w);
        SimpleCompositor sc4 = new SimpleCompositor(w);
        SimpleCompositor sc5 = new SimpleCompositor(w);
        SimpleCompositor sc6 = new SimpleCompositor(w);
        SimpleCompositor sc7 = new SimpleCompositor(w);
        Row row1 = new Row(sc1);
        Column col1 = new Column(sc2);
        Column col2 = new Column(sc3);
        Row row2 = new Row(sc6);
        Glyph a = new Character('a');
        Glyph b = new Character('b');
        Glyph c = new Character('c');
        Glyph d = new Character('d');
        Glyph f = new Character('f');
        Glyph g = new Character('g');
        Scroller scroll1 = new Scroller(sc4);
        Border border1 = new Border(sc5, 2);
        Glyph rect1 = new Rectangle(20, 10);

        try {
            row2.insert(a, 0);    
            row2.insert(b, 1);    
            row2.insert(c, 2);   
            col1.insert(d, 0); 
            col1.insert(f, 1);  
            col1.insert(g, 2);    
            border1.insert(row2);
            row2.insert(col1, 3); 
        }
        catch (OperationNotSupportedException e) {
            System.out.println("bad.");
        }
        w.setContents(border1);
    }

    public static void test2() {
        Window w = new SwingWindow("Lexi");
        SimpleCompositor sc1 = new SimpleCompositor(w);
        SimpleCompositor sc2 = new SimpleCompositor(w);
        SimpleCompositor sc3 = new SimpleCompositor(w);
        SimpleCompositor sc4 = new SimpleCompositor(w);
        SimpleCompositor sc5 = new SimpleCompositor(w);
        SimpleCompositor sc6 = new SimpleCompositor(w);
        SimpleCompositor sc7 = new SimpleCompositor(w);
        Row row1 = new Row(sc1);
        Column col1 = new Column(sc2);
        Column col2 = new Column(sc3);
        Row row2 = new Row(sc6);
        Glyph a = new Character('a');
        Glyph b = new Character('b');
        Glyph c = new Character('c');
        Glyph d = new Character('d');
        Glyph f = new Character('f');
        Glyph g = new Character('g');
        Scroller scroll1 = new Scroller(sc4);
        Border border1 = new Border(sc5, 2);
        Glyph rect1 = new Rectangle(20, 10);

        try {
            row2.insert(a, 0);       
            row2.insert(b, 1);         
            row2.insert(c, 2);   
            col1.insert(d, 0); 
            col1.insert(f, 1);  
            col1.insert(g, 2);    
            scroll1.insert(col1);
            row2.insert(scroll1, 3); 
        }
        catch (OperationNotSupportedException e) {
            System.out.println("bad.");
        }
        w.setContents(row2);
    }

    public static void test3() {
        Window w = new SwingWindow("Lexi");
        SimpleCompositor sc1 = new SimpleCompositor(w);
        SimpleCompositor sc2 = new SimpleCompositor(w);
        SimpleCompositor sc3 = new SimpleCompositor(w);
        SimpleCompositor sc4 = new SimpleCompositor(w);
        SimpleCompositor sc5 = new SimpleCompositor(w);
        SimpleCompositor sc6 = new SimpleCompositor(w);
        SimpleCompositor sc7 = new SimpleCompositor(w);
        Row row1 = new Row(sc1);
        Column col1 = new Column(sc2);
        Column col2 = new Column(sc3);
        Row row2 = new Row(sc6);
        Glyph a = new Character('a');
        Glyph b = new Character('b');
        Glyph c = new Character('c');
        Glyph d = new Character('d');
        Glyph f = new Character('f');
        Glyph g = new Character('g');
        Scroller scroll1 = new Scroller(sc4);
        Border border1 = new Border(sc5, 2);
        Glyph rect1 = new Rectangle(20, 10);

        try {
            row2.insert(a, 0);    
            row2.insert(b, 1);    
            row2.insert(c, 2);   
            col1.insert(d, 0); 
            col1.insert(f, 1);  
            col1.insert(g, 2);    
            scroll1.insert(row2);
            border1.insert(scroll1);
            row2.insert(col1, 3); 
        }
        catch (OperationNotSupportedException e) {
            System.out.println("bad.");
        }
        w.setContents(border1);
    }

    public static void testLegacy() {
        Window w = new SwingWindow("Lexi");
        SimpleCompositor sc1 = new SimpleCompositor(w);
        SimpleCompositor sc2 = new SimpleCompositor(w);
        SimpleCompositor sc3 = new SimpleCompositor(w);
        SimpleCompositor sc4 = new SimpleCompositor(w);
        SimpleCompositor sc5 = new SimpleCompositor(w);
        Row row1 = new Row(sc1);
        Column col1 = new Column(sc2);
        Column col2 = new Column(sc3);
        Glyph a = new Character('a');
        Glyph b = new Character('b');
        Glyph c = new Character('c');
        Glyph d = new Character('d');
        Glyph f = new Character('f');
        Glyph g = new Character('g');
        Glyph rect1 = new Rectangle(20, 10);

        try {
            col1.insert(a, 0);
            col1.insert(row1, 1);
            col1.insert(c, 2);
            row1.insert(b, 0);
            row1.insert(rect1, 1);
            row1.insert(col2, 2);
            row1.insert(d, 3);
            col2.insert(f, 0);
            col2.insert(g, 1);
        }
        catch (OperationNotSupportedException e) {
            System.out.println("bad.");
        }
        w.setContents(col1);
    }

}
