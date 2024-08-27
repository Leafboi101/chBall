/**
 * This class represents a simple picture.
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)  ((a) modified 2015-08 by Garrett Shorr, (b) 2016-08 by Leon Montealegre, (c) 2018-08 by Garrett Shorr, (d) 2020, 2024 by Jared Guiou)
 * (a) added Rectangles
 * (b) added Transparency & Rotation
 * (c) added Ellipses
 * (d) adapted for repl.it, then for CodeHS
 */
public class MyProgram
{
    /* The main method of this program draws a picture!
     * The colors available are: red, black, blue, yellow, green,
     * magenta, white, gray, orange, pink, dark gray, light gray, and cyan.  
     * In the changeColor method, supply the color as a String in all lowercase as
     * written above.
    */
    
    public static void main(String[] args)
    {
/*
        Square chbase = new Square();
        chbase.setY(60);
        chbase.setX(120);
        chbase.changeSize(240);
        chbase.changeColor("red");
        chbase.makeVisible();
*/
        
        final int CBY = 65; // countryball y
        final int CBX = -35; // countryball x
        final int GRASS_Y = 45; // grass y
        final int MTY = 0; // mountain y
        final int MTX = -110; // mountain x
        final int ZUG_X = 200;
        final int ZUG_Y = 300;
        //String SkyColor = ("cyan"); // sky color
        String SkyColor = ("light gray"); // fog color
        
        Square sky = new Square();
        sky.setY(0);
        sky.setX(0);
        sky.changeSize(1000);
        sky.changeColor(SkyColor);
        sky.makeVisible();
        
        Triangle Mt1b = new Triangle();
        Mt1b.changeColor("dark gray");
        Mt1b.changeSize(1010, 1010);
        Mt1b.setX(380+MTX);
        Mt1b.setY(30+MTY);
        Mt1b.makeVisible();
        
        Triangle Mt1 = new Triangle();
        Mt1.changeColor("gray");
        Mt1.changeSize(1000, 1000);
        Mt1.setX(380+MTX);
        Mt1.setY(40+MTY);
        Mt1.makeVisible();
        
        Triangle Mt2b = new Triangle();
        Mt2b.changeColor("dark gray");
        Mt2b.changeSize(1010, 1010);
        Mt2b.setX(235+MTX);
        Mt2b.setY(100+MTY);
        Mt2b.makeVisible();
        
        Triangle Mt2 = new Triangle();
        Mt2.changeColor("gray");
        Mt2.changeSize(1000, 1000);
        Mt2.setX(235+MTX);
        Mt2.setY(110+MTY);
        Mt2.makeVisible();
        
        Square grassb = new Square();
        grassb.setY(225+GRASS_Y);
        grassb.setX(0);
        grassb.changeSize(1000);
        grassb.changeColor("dark green");
        grassb.makeVisible();
        
        Square grass = new Square();
        grass.setY(230+GRASS_Y);
        grass.setX(0);
        grass.changeSize(1000);
        grass.changeColor("green");
        grass.makeVisible();
        
        Ellipse lakeZugBorder = new Ellipse();
        lakeZugBorder.setY(ZUG_Y-5);
        lakeZugBorder.setX(ZUG_X-5);
        lakeZugBorder.changeSize(360, 210);
        lakeZugBorder.changeColor("dark lake");
        lakeZugBorder.makeVisible();
        
        Ellipse lakeZug = new Ellipse();
        lakeZug.setY(ZUG_Y);
        lakeZug.setX(ZUG_X);
        lakeZug.changeSize(350, 200);
        lakeZug.changeColor("lake");
        lakeZug.makeVisible();
        
        Circle chborder = new Circle();
        chborder.setY(55+CBY);
        chborder.setX(115+CBX);
        chborder.changeSize(250);
        chborder.changeColor("black");
        chborder.makeVisible();
        
        Circle chbase = new Circle();
        chbase.setY(60+CBY);
        chbase.setX(120+CBX);
        chbase.changeSize(240);
        chbase.changeColor("red");
        chbase.makeVisible();

        Rect chvc = new Rect();
        chvc.changeColor("white");
        chvc.changeSize(140, 50);
        chvc.setX(215+CBX);
        chvc.setY(112+CBY);
        chvc.makeVisible();
        
        Rect chhc = new Rect();
        chhc.changeColor("white");
        chhc.changeSize(50, 140);
        chhc.setX(170+CBX);
        chhc.setY(157+CBY);
        chhc.makeVisible();
        
        Circle cheye1border = new Circle();
        cheye1border.setY(125+CBY);
        cheye1border.setX(180+CBX);
        cheye1border.changeSize(40);
        cheye1border.changeColor("black");
        cheye1border.makeVisible();
        
        Circle cheye2border = new Circle();
        cheye2border.setY(125+CBY);
        cheye2border.setX(260+CBX);
        cheye2border.changeSize(40);
        cheye2border.changeColor("black");
        cheye2border.makeVisible();
        
        Circle cheye1 = new Circle();
        cheye1.setY(130+CBY);
        cheye1.setX(185+CBX);
        cheye1.changeSize(30);
        cheye1.changeColor("white");
        cheye1.makeVisible();
        
        Circle cheye2 = new Circle();
        cheye2.setY(130+CBY);
        cheye2.setX(265+CBX);
        cheye2.changeSize(30);
        cheye2.changeColor("white");
        cheye2.makeVisible();
        
        
    }

}
