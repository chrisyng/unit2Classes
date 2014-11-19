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
    
    private enum IsOn {LIGHT_IS_ON, LIGHT_IS_OFF}

    public void draw (Graphics2D g2)
    {
        int leftSide = buildingDrawn.getStartXPos();
        int topSide = buildingDrawn.getStartYPos();
        int buildingHeight = buildingDrawn.getBuildingHeight();
        int buildingWidth = buildingDrawn.getBuildingWidth();
        int windowWidth = buildingWidth/5;        
        int numFloors = buildingHeight / 40;
        int distanceDown = 20;        

        for (int i=1; i<=numFloors; i++)
        {            
            int distanceFromLeft = windowWidth;
            for (int j=1; j<=2; j++)
            {            
                Rectangle window = new Rectangle(leftSide+distanceFromLeft, topSide + distanceDown, windowWidth, 20);
                distanceFromLeft = distanceFromLeft + 2*windowWidth;
                IsOn isOn;
                double chance = Math.random();
                if (chance<0.5)
                {
                    isOn = IsOn.LIGHT_IS_ON;
                }
                else
                {
                    isOn = IsOn.LIGHT_IS_OFF;
                }
                switch (isOn)
                {
                    case LIGHT_IS_ON:
                    g2.setColor(Color.YELLOW);
                    break;
                    case LIGHT_IS_OFF:
                    g2.setColor(Color.BLACK);
                    break;                    
                }                
                g2.draw(window);
                g2.fill(window);
            }
            distanceDown += 40;
        }

    }
}
