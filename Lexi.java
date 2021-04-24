import javax.naming.OperationNotSupportedException;
import lexi.*;
import lexiwidget.*;
import lexi.Character;
import lexicommand.Command;
import lexicommand.DecrementFontSizeCommand;
import lexicommand.IncrementFontSizeCommand;
import lexicommand.SetFontSizeCommand;
import lexiwindow.ApplicationWindow;
import lexiwindow.Window;

// Bridge(151), AbstractFactory(87), Command(223): Client

public class Lexi {
    
    public static void main(String[] args) {
        testHW5again();
        //testLegacy();
    }

    // public static void test1() {
    //     Window w = new ApplicationWindow("Lexi");
    //     SimpleCompositor sc1 = new SimpleCompositor(w);
    //     SimpleCompositor sc2 = new SimpleCompositor(w);
    //     SimpleCompositor sc3 = new SimpleCompositor(w);
    //     SimpleCompositor sc4 = new SimpleCompositor(w);
    //     SimpleCompositor sc5 = new SimpleCompositor(w);
    //     SimpleCompositor sc6 = new SimpleCompositor(w);
    //     SimpleCompositor sc7 = new SimpleCompositor(w);
    //     Row row1 = new Row(sc1);
    //     Column col1 = new Column(sc2);
    //     Column col2 = new Column(sc3);
    //     Row row2 = new Row(sc6);
    //     Glyph a = new Character('a');
    //     Glyph b = new Character('b');
    //     Glyph c = new Character('c');
    //     Glyph d = new Character('d');
    //     Glyph f = new Character('f');
    //     Glyph g = new Character('g');
    //     Scroller scroll1 = new Scroller(sc4);
    //     Border border1 = new Border(sc5, 2);
    //     Glyph rect1 = new Rectangle(20, 10);

    //     try {
    //         row2.insert(a, 0);    
    //         row2.insert(b, 1);    
    //         row2.insert(c, 2);   
    //         col1.insert(d, 0); 
    //         col1.insert(f, 1);  
    //         col1.insert(g, 2);    
    //         border1.insert(row2);
    //         row2.insert(col1, 3); 
    //     }
    //     catch (OperationNotSupportedException e) {
    //         System.out.println("bad.");
    //     }
    //     w.setContents(border1);
    // }

    // public static void test2() {
    //     Window w = new ApplicationWindow("Lexi");
    //     SimpleCompositor sc1 = new SimpleCompositor(w);
    //     SimpleCompositor sc2 = new SimpleCompositor(w);
    //     SimpleCompositor sc3 = new SimpleCompositor(w);
    //     SimpleCompositor sc4 = new SimpleCompositor(w);
    //     SimpleCompositor sc5 = new SimpleCompositor(w);
    //     SimpleCompositor sc6 = new SimpleCompositor(w);
    //     SimpleCompositor sc7 = new SimpleCompositor(w);
    //     Row row1 = new Row(sc1);
    //     Column col1 = new Column(sc2);
    //     Column col2 = new Column(sc3);
    //     Row row2 = new Row(sc6);
    //     Glyph a = new Character('a');
    //     Glyph b = new Character('b');
    //     Glyph c = new Character('c');
    //     Glyph d = new Character('d');
    //     Glyph f = new Character('f');
    //     Glyph g = new Character('g');
    //     Scroller scroll1 = new Scroller(sc4);
    //     Border border1 = new Border(sc5, 2);
    //     Glyph rect1 = new Rectangle(20, 10);

    //     try {
    //         row2.insert(a, 0);       
    //         row2.insert(b, 1);         
    //         row2.insert(c, 2);   
    //         col1.insert(d, 0); 
    //         col1.insert(f, 1);  
    //         col1.insert(g, 2);    
    //         scroll1.insert(col1);
    //         row2.insert(scroll1, 3); 
    //     }
    //     catch (OperationNotSupportedException e) {
    //         System.out.println("bad.");
    //     }
    //     w.setContents(row2);
    // }

    // public static void test3() {
    //     Window w = new ApplicationWindow("Lexi");
    //     SimpleCompositor sc1 = new SimpleCompositor(w);
    //     SimpleCompositor sc2 = new SimpleCompositor(w);
    //     SimpleCompositor sc3 = new SimpleCompositor(w);
    //     SimpleCompositor sc4 = new SimpleCompositor(w);
    //     SimpleCompositor sc5 = new SimpleCompositor(w);
    //     SimpleCompositor sc6 = new SimpleCompositor(w);
    //     SimpleCompositor sc7 = new SimpleCompositor(w);
    //     Row row1 = new Row(sc1);
    //     Column col1 = new Column(sc2);
    //     Column col2 = new Column(sc3);
    //     Row row2 = new Row(sc6);
    //     Glyph a = new Character('a');
    //     Glyph b = new Character('b');
    //     Glyph c = new Character('c');
    //     Glyph d = new Character('d');
    //     Glyph f = new Character('f');
    //     Glyph g = new Character('g');
    //     Scroller scroll1 = new Scroller(sc4);
    //     Border border1 = new Border(sc5, 2);
    //     Glyph rect1 = new Rectangle(20, 10);

    //     try {
    //         row2.insert(a, 0);    
    //         row2.insert(b, 1);    
    //         row2.insert(c, 2);   
    //         col1.insert(d, 0); 
    //         col1.insert(f, 1);  
    //         col1.insert(g, 2);    
    //         scroll1.insert(row2);
    //         border1.insert(scroll1);
    //         row2.insert(col1, 3); 
    //     }
    //     catch (OperationNotSupportedException e) {
    //         System.out.println("bad.");
    //     }
    //     w.setContents(border1);
    // }

    public static void testLegacy() {
        Window w = new ApplicationWindow("Lexi");
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

    // public static void testButtonLabel() {
    //     Window w = new ApplicationWindow("Lexi");
    //     SimpleCompositor sc1 = new SimpleCompositor(w);
    //     SimpleCompositor sc2 = new SimpleCompositor(w);
    //     SimpleCompositor sc3 = new SimpleCompositor(w);
    //     SimpleCompositor sc4 = new SimpleCompositor(w);
    //     SimpleCompositor sc5 = new SimpleCompositor(w);
    //     SimpleCompositor sc6 = new SimpleCompositor(w);
    //     SimpleCompositor sc7 = new SimpleCompositor(w);
    //     SimpleCompositor sc8 = new SimpleCompositor(w);
    //     Row row1 = new Row(sc1);
    //     Column col1 = new Column(sc2);
    //     Column col2 = new Column(sc3);
    //     Row row2 = new Row(sc6);
    //     Glyph a = new Character('a');
    //     Glyph b = new Character('b');
    //     Glyph c = new Character('c');
    //     Glyph d = new Character('d');
    //     Glyph f = new Character('f');
    //     Glyph g = new Character('g');
    //     Scroller scroll1 = new Scroller(sc4);
    //     Border border1 = new Border(sc5, 2);
    //     Glyph rect1 = new Rectangle(20, 10);
    //     Label label1 = GUIFactory.instance().createLabel(sc7);
    //     Button button1 = GUIFactory.instance().createButton(sc8);

    //     try {
    //         row2.insert(a, 0);    
    //         row2.insert(b, 1);    
    //         row2.insert(c, 2);
    //         button1.insert(row2); 
    //         col1.insert(d, 0); 
    //         col1.insert(f, 1);  
    //         col1.insert(g, 2);
    //         label1.insert(col1);    
    //         scroll1.insert(button1);
    //         border1.insert(scroll1);
    //         row2.insert(label1, 3); 
    //     }
    //     catch (OperationNotSupportedException e) {
    //         System.out.println("bad.");
    //     }
    //     w.setContents(border1);
    // }

    // public static void testButtonLabel2() {
    //     Window w = new ApplicationWindow("Lexi");

    //     SetFontSizeCommand(w);

    //     SimpleCompositor sc1 = new SimpleCompositor(w);
    //     SimpleCompositor sc2 = new SimpleCompositor(w);
    //     SimpleCompositor sc3 = new SimpleCompositor(w);
    //     SimpleCompositor sc4 = new SimpleCompositor(w);
    //     SimpleCompositor sc5 = new SimpleCompositor(w);
    //     SimpleCompositor sc6 = new SimpleCompositor(w);
    //     SimpleCompositor sc7 = new SimpleCompositor(w);
    //     SimpleCompositor sc8 = new SimpleCompositor(w);
    //     Row row1 = new Row(sc1);
    //     Column col1 = new Column(sc2);
    //     Column col2 = new Column(sc3);
    //     Row row2 = new Row(sc6);
    //     Glyph a = new Character('a');
    //     Glyph b = new Character('b');
    //     Glyph c = new Character('c');
    //     Glyph d = new Character('d');
    //     Glyph f = new Character('f');
    //     Glyph g = new Character('g');
    //     Glyph h = new Character('h');

    //     Scroller scroll1 = new Scroller(sc4);
    //     Border border1 = new Border(sc5, 2);
    //     Glyph rect1 = new Rectangle(20, 10);
    //     Label label1 = GUIFactory.instance().createLabel(sc7);
    //     Button button1 = GUIFactory.instance().createButton(sc8);

    //     try {
    //         row2.insert(a, 0);    
    //         row2.insert(rect1, 1); 
    //         col1.insert(c, 0);
    //         row1.insert(f, 0);
    //         row1.insert(g, 1);
    //         button1.insert(row1);
    //         col1.insert(button1, 1);
    //         col1.insert(h, 2);
    //         row2.insert(col1, 2);   
    //         row2.insert(d, 3);
    //         scroll1.insert(row2);
    //         border1.insert(scroll1);
    //     }
    //     catch (OperationNotSupportedException e) {
    //         System.out.println("bad.");
    //     }
    //     w.setContents(border1);
    // }

    public static void testHW5() {
        
        Window test = new ApplicationWindow("my Window");
        
        //Root Column
        SimpleCompositor rootComp = new SimpleCompositor(test);
        Column root = new Column(rootComp);
            
        try {
            //Button Row Creation
            SimpleCompositor buttonRowComp = new SimpleCompositor(test);
            Row buttonRow = new Row(buttonRowComp);
            root.insert(buttonRow, 0);
            
            SimpleCompositor button20RowComp = new SimpleCompositor(test);
            Row button20Row = new Row(button20RowComp);
            Character twenty2 = new Character('2');
            Character twenty0 = new Character('0');
            button20Row.insert(twenty2, 0);
            button20Row.insert(twenty0, 1);
            
            Command button20Comm = new SetFontSizeCommand("Font size 20", 20);
            SimpleCompositor button20Comp = new SimpleCompositor(test);
            Button button20 = GUIFactory.instance().createButton(button20Comp, button20Row, button20Comm);
            buttonRow.insert(button20, 0);
            
            
            SimpleCompositor button14RowComp = new SimpleCompositor(test);
            Row button14Row = new Row(button14RowComp);
            Character fourteen1 = new Character('1');
            Character fourteen4 = new Character('4');
            button14Row.insert(fourteen1, 0);
            button14Row.insert(fourteen4, 1);
            
            Command button14Comm = new SetFontSizeCommand("Font size 14", 14);
            SimpleCompositor button14Comp = new SimpleCompositor(test);
            Button button14 = GUIFactory.instance().createButton(button14Comp, button14Row, button14Comm);
            buttonRow.insert(button14, 0);
            
            SimpleCompositor buttonPlusRowComp = new SimpleCompositor(test);
            Row buttonPlusRow = new Row(buttonPlusRowComp);
            Character Plus = new Character('+');
            buttonPlusRow.insert(Plus, 0);
            
            Command buttonPlusComm = new IncrementFontSizeCommand("Bigger Font Size");
            SimpleCompositor buttonPlusComp = new SimpleCompositor(test);
            Button buttonPlus = GUIFactory.instance().createButton(buttonPlusComp, buttonPlusRow, buttonPlusComm);
            buttonRow.insert(buttonPlus, 0);
            
            SimpleCompositor buttonMinusRowComp = new SimpleCompositor(test);
            Row buttonMinusRow = new Row(buttonMinusRowComp);
            Character Minus = new Character('-');
            buttonMinusRow.insert(Minus, 0);
            
            Command buttonMinusComm = new DecrementFontSizeCommand("Smaller Font Size");
            SimpleCompositor buttonMinusComp = new SimpleCompositor(test);
            Button buttonMinus = GUIFactory.instance().createButton(buttonMinusComp, buttonMinusRow, buttonMinusComm);
            buttonRow.insert(buttonMinus, 0);
		

            ////Random Stuff
            SimpleCompositor x = new SimpleCompositor(test);
            SimpleCompositor x1 = new SimpleCompositor(test);
            SimpleCompositor x3 = new SimpleCompositor(test);
            SimpleCompositor labComp = new SimpleCompositor(test);
            SimpleCompositor butComp = new SimpleCompositor(test);
            SimpleCompositor bordComp = new SimpleCompositor(test);
            SimpleCompositor scbarcomp = new SimpleCompositor(test);
            Character a = new Character('a');
            Character b = new Character('b');
            Character c = new Character('c');
            Character d = new Character('d');
            Character e = new Character('e');
            Rectangle rect = new Rectangle(10,10);
            Character on = new Character('1');
            Rectangle rect2 = new Rectangle(10,15);
            Character two = new Character('2');
            
            Row subRoot2 = new Row(x1);
            Row subRoot = new Row(x);
            Column subRoot2_1 = new Column(x3);
            Command x32 = new SetFontSizeCommand("ba", 10);
            Label label = GUIFactory.instance().createLabel(labComp, subRoot2);
            Button buttonba = GUIFactory.instance().createButton(butComp, subRoot, x32);
            Scroller scbar = new Scroller(scbarcomp, subRoot2_1);
            Border bord = new Border(bordComp, scbar, 5);
        
            root.insert(buttonba, 0);
            root.insert(c, 0);
            subRoot.insert(a, 0);
            subRoot.insert(b, 0);
            subRoot2.insert(bord, 0);
            subRoot2_1.insert(on, 0);
            subRoot2_1.insert(rect2,0);
            subRoot2_1.insert(two, 0);
            subRoot2.insert(d, 0);
            subRoot2.insert(rect, 0);
            subRoot2.insert(e, 0);
            root.insert(label, 0);
        
            
        } 
        catch(OperationNotSupportedException e) {
            System.out.println("bad.");
        }
        test.setContents(root);
    }

    public static void testHW5again() {
        
        Window test = new ApplicationWindow("my Window");
        
        //Root Column
        SimpleCompositor rootComp = new SimpleCompositor(test);
        Column root = new Column(rootComp);
        
        try {
            //Button Row Creation
            SimpleCompositor buttonRowComp = new SimpleCompositor(test);
            Row buttonRow = new Row(buttonRowComp);
            root.insert(buttonRow, 0);
            
        //     SimpleCompositor button20RowComp = new SimpleCompositor(test);
        //     Row button20Row = new Row(button20RowComp);
        //     Character twenty2 = new Character('2');
        //     Character twenty0 = new Character('0');
        //     button20Row.insert(twenty2, 0);
        //     button20Row.insert(twenty0, 1);
            
        //     Command button20Comm = new SetFontSizeCommand("Font size 20", 20);
        //     SimpleCompositor button20Comp = new SimpleCompositor(test);
        //     Button button20 = GUIFactory.instance().createButton(button20Comp, button20Row, button20Comm);
        //     buttonRow.insert(button20, 0);
            
            
        //     SimpleCompositor button14RowComp = new SimpleCompositor(test);
        //     Row button14Row = new Row(button14RowComp);
        //     Character fourteen1 = new Character('1');
        //     Character fourteen4 = new Character('4');
        //     button14Row.insert(fourteen1, 0);
        //     button14Row.insert(fourteen4, 1);
            
        //     Command button14Comm = new SetFontSizeCommand("Font size 14", 14);
        //     SimpleCompositor button14Comp = new SimpleCompositor(test);
        //     Button button14 = GUIFactory.instance().createButton(button14Comp, button14Row, button14Comm);
        //     buttonRow.insert(button14, 0);
            
        //     SimpleCompositor buttonPlusRowComp = new SimpleCompositor(test);
        //     Row buttonPlusRow = new Row(buttonPlusRowComp);
        //     Character Plus = new Character('+');
        //     buttonPlusRow.insert(Plus, 0);
            
        //     Command buttonPlusComm = new IncrementFontSizeCommand("Bigger Font Size");
        //     SimpleCompositor buttonPlusComp = new SimpleCompositor(test);
        //     Button buttonPlus = GUIFactory.instance().createButton(buttonPlusComp, buttonPlusRow, buttonPlusComm);
        //     buttonRow.insert(buttonPlus, 0);
            
        //     SimpleCompositor buttonMinusRowComp = new SimpleCompositor(test);
        //     Row buttonMinusRow = new Row(buttonMinusRowComp);
        //     Character Minus = new Character('-');
        //     buttonMinusRow.insert(Minus, 0);
            
        //     Command buttonMinusComm = new DecrementFontSizeCommand("Smaller Font Size");
        //     SimpleCompositor buttonMinusComp = new SimpleCompositor(test);
        //     Button buttonMinus = GUIFactory.instance().createButton(buttonMinusComp, buttonMinusRow, buttonMinusComm);
        //     buttonRow.insert(buttonMinus, 0);
		

        //     ////Random Stuff
        //     SimpleCompositor x = new SimpleCompositor(test);
        //     SimpleCompositor x1 = new SimpleCompositor(test);
        //     SimpleCompositor x3 = new SimpleCompositor(test);
        //     SimpleCompositor labComp = new SimpleCompositor(test);
        //     SimpleCompositor butComp = new SimpleCompositor(test);
        //     SimpleCompositor bordComp = new SimpleCompositor(test);
        //     SimpleCompositor scbarcomp = new SimpleCompositor(test);
        //     Character a = new Character('a');
        //     Character b = new Character('b');
        //     Character c = new Character('c');
        //     Character d = new Character('d');
        //     Character e = new Character('e');
        //     Rectangle rect = new Rectangle(10,10);
        //     Character on = new Character('1');
        //     Rectangle rect2 = new Rectangle(10,15);
        //     Character two = new Character('2');
            
        //     Row subRoot2 = new Row(x1);
        //     Row subRoot = new Row(x);
        //     Column subRoot2_1 = new Column(x3);
        //     Command x32 = new SetFontSizeCommand("ba", 10);
        //     Label label = GUIFactory.instance().createLabel(labComp, subRoot2);
        //     Button buttonba = GUIFactory.instance().createButton(butComp, subRoot, x32);
        //     Scroller scbar = new Scroller(scbarcomp, subRoot2_1);
        //     Border bord = new Border(bordComp, scbar, 5);
        
        //     root.insert(buttonba, 0);
        //     root.insert(c, 0);
        //     subRoot.insert(a, 0);
        //     subRoot.insert(b, 0);
        //     subRoot2.insert(bord, 0);
        //     subRoot2_1.insert(on, 0);
        //     subRoot2_1.insert(rect2,0);
        //     subRoot2_1.insert(two, 0);
        //     subRoot2.insert(d, 0);
        //     subRoot2.insert(rect, 0);
        //     subRoot2.insert(e, 0);
        //     root.insert(label, 0);
        
            
        } 
        catch(OperationNotSupportedException e) {
            System.out.println("bad.");
        }
        test.setContents(root);
    }


}

// Label label1 = GUIFactory.instance().createLabel(sc4);

// Button button1 = GUIFactory.instance().createButton(sc5);