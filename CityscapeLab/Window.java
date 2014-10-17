import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * Class that draws windows on a specified building with specified number of floors.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window
{
    // instance variables - replace the example below with your own
    private Building buildingDrawn;
    /**
     * Constructor for objects of class Window
     */
    public Window(Building building)
    {
        this.buildingDrawn = building;
    }
    
    public void draw (Graphics2D g2)
    {
        int leftSide = buildingDrawn.getStartXPos();
        int topSide = buildingDrawn.getStartYPos();
        int buildingHeight = buildingDrawn.getBuildingHeight();
        int buildingWidth = buildingDrawn.getBuildingWidth();
        int windowWidth = buildingWidth/5;
        int distanceFromLeft = windowWidth;
        int numFloors = buildingHeight / 40;
        if (numFloors>1)
        {
        for (int i=1; i<numFloors; i++)
        {
            for (int i=1; i<=2; i++)
            {            
                Rectangle window = new Rectangle(leftSide+distanceFromLeft, topSide + 20, windowWidth, 20);
                distanceFromLeft = distanceFromLeft + 2*windowWidth;
                g2.setColor(Color.YELLOW);
                g2.draw(window);
                g2.fill(window);
            }       
        }
    }
    
}
