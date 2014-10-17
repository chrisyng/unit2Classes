import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * A class that models an animated moon that moves across the sky.
 * 
 * @author Christopher Ng   
 * @version 10/8/14
 */
public class MoonOrSun
{
    /** starting left position coordinate */
    private int xLeft;
    /**starting top position coordinate */
    private int yTop;
    /** vertical height of moon */
    private int height;
    /** horizontal width of moon */
    private int width;
    /**
     * Default constructor for objects of class MoonOrSun
     * @param xLeft starting left x coordinate
     * @param yTop starting top y coordinate
     * @param width width of moon
     * @param height height of moon
     */
    public MoonOrSun(int xLeft, int yTop, int width, int height)
    {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.width = width;
        this.height = height;
    }
    
    public void changePos()
    /**
     * changes x-position of the moon to move it across the sky
     * @post moon has a new xLeft position to the right
     */
    {
        this.xLeft = this.xLeft +150;
    }
    
    public void resetPos()
    /**
     * moves moon back to xLeft of 0
     * @post moon will be moved back to the far left of the screen
     */
    {
        this.xLeft = 0;
    }    
    
    public int getXPos()
    {
        return this.xLeft;
    } 

    
    public void drawSun(Graphics2D g2)
    /**
     * creates a yellow ellipse object and fills it
     * @param Graphics2D g2 the graphics object which will draw the sun 
     */
    {        
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft, yTop, width, height);
        g2.setColor(Color.YELLOW);
        g2.draw(sun);        
        g2.fill(sun);
    }
    
    public void drawMoon(Graphics2D g2)
    /**
     * creates a yellow ellipse object and fills it
     * @param Graphics2D g2 the graphics object which will draw the moon
     */
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft, yTop, width, height);
        g2.setColor(Color.YELLOW);
        g2.draw(moon);
        g2.fill(moon);
        Ellipse2D.Double moonCrescent = new Ellipse2D.Double(xLeft, yTop, width*0.66, height);
        g2.setColor(Color.BLACK);
        g2.draw(moonCrescent);
        g2.fill(moonCrescent);
    }
}
