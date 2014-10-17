import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
/**
 * Class that defines a building with starting positions, height, and width.
 * 
 * @author Christopher Ng 
 * @version 2 October 2014
 */
public class Building
{
    /** int specifying height of the JFrame object */
    private int windowHeight;
    /** int specifying building's width */
    private int width;
    /**int specifying leftmost coordinate */
    private int xleft;
    /** int specifying top coordinate */
    private int ytop;
    private Hill referenceHill;    
    /**
     * Default constructor for objects of class Building
     * @param windowHeight the height of the JFrame window
     * @param width width of the building
     * @param xleft starting x position
     * @param ytop starting y position
     */   
    public Building(int xleft, int ytop, int width, int windowHeight, Hill currentHill)
    
    {        
        this.windowHeight = windowHeight;
        this.width = width;
        this.xleft = xleft;
        this.ytop = ytop;        
        this.referenceHill = currentHill;
    }  
    
    /**
     * Draws a building based on variables initialized in constructor
     * @param Graphics2D g2 the object that draws the Building
     */
    public void draw(Graphics2D g2)
    
    {
       Rectangle mainBuilding = new Rectangle(xleft, ytop, width, windowHeight-ytop-referenceHill.getHillHeight());
       g2.setColor(Color.GRAY);
       g2.draw(mainBuilding);
       g2.fill(mainBuilding);              
    }
    
    /**
     * gets the height of the building
     * @return int with value of the building height
     */
    public int getBuildingHeight()
    
    {
        return windowHeight-ytop-referenceHill.getHillHeight();
    }
    
    /**
     * gets the width of the building
     * @return int with the value of the building width
     */
    public int getBuildingWidth()
    
    {
        return this.width;
    }
    
    /**
     * gets the x start position of the building
     * @return int with the value of the building's leftmost x coordinate
     */
    public int getStartXPos()
    
    {
        return this.xleft;
    }
    
    /**
     * gets the y start position of the building
     * @return int with the value of the building's topmost x coordinate
     */
    public int getStartYPos()
    
    {
        return this.ytop;
    }   
   
}


