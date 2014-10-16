import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * A class that models an animated moon that moves across the sky.
 * 
 * @author Christopher Ng   
 * @version 10/8/14
 */
public class Moon
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
     * Default constructor for objects of class Moon
     * @param xLeft starting left x coordinate
     * @param yTop starting top y coordinate
     * @param width width of moon
     * @param height height of moon
     */
    public Moon(int xLeft, int yTop, int width, int height)
    {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.width = width;
        this.height = height;
    }

    /**
     * creates a yellow ellipse object and fills it
     */
    public void draw(Graphics2D g2)
    {       
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft, yTop, width, height);
        g2.setColor(Color.YELLOW);
        g2.draw(moon);        
        g2.fill(moon);
    }
    
    public void changePos()
    {
        this.xLeft = this.xLeft +150;
    }
    

}
