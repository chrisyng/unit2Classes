import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * Draws a hill at the front of the CityScape
 * 
 * @author Christopher Ng
 * @version 6 October 2014
 */
public class Hill
{
    /** holds value for maximum height of the hill in pixels */   
    private int hillHeight;
    private int hillWidth;
    private int yTop;
    private int xLeft;
    /**
     * default constructor for objects of class hill
     * @param xLeft starting x position of this hill
     * @param yTOp startting y-top position of this hill
     * @param hillWidth width of the hill
     * @param hillHeight height of the hill
     */
    public Hill(int xLeft, int yTop, int hillWidth, int hillHeight)
    {
        this.hillHeight = hillHeight;
        this.hillWidth = hillWidth;
        this.yTop = yTop;
        this.xLeft = xLeft;        
    }    
    
    /**
     * creates a hill rectangle and draws it with the graphics object
     * @param g2 Graphics2D object which will draw the hill
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle (xLeft, yTop, hillWidth, hillHeight);
        g2.setColor(Color.GREEN);
        g2.draw(grass);
        g2.fill(grass);
    }
    
    /**
     * returns the height of this hill
     * @return the int with this hill's height
     */
    public int getHillHeight()
    {
        return this.hillHeight;
    }    

}
