import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;

/**
 * Creates a blue background for the "sky"
 * 
 * @author Christopher Ng
 * @version 6 October 2014
 */
public class Sky
{
    private int windowHeight;
    private int windowWidth;    
    public Sky(int windowWidth, int windowHeight)
    {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;        
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0, 0, windowWidth, windowHeight);
        if (CityscapeComponent.isNight)
        {
            g2.setColor(Color.BLACK);
            g2.draw(sky);
            g2.fill(sky);
        }
        if (CityscapeComponent.isNight == false)
        {
            g2.setColor(Color.BLUE);
            g2.draw(sky);
            g2.fill(sky);
        }        
    }     

}
