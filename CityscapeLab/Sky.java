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
    /** windowHeight height of the JFrame window */
    private int windowHeight;
    /** windowWidth width of the JFrame window */
    private int windowWidth;
    /** component component that takes this Sky object */
    private CityscapeComponent component;
    /** skyColor color of this sky, changes based on isNight */
    private Color skyColor=Color.BLACK;
    /**
     * default constructor for class sky
     * @param CityscapeComponent component component object that the sky is drawn into
     */
    public Sky(CityscapeComponent component)
    
    {
        this.windowWidth = component.getWidth();
        this.windowHeight = component.getHeight();
        this.component = component;
    }
    
    /**
     * changes the background color of the sky
     * @param skyColor color to set the sky to
     */
    public void changeColor(Color skyColor)
    
    {
        this.skyColor = skyColor;
    }
    
    /**
     * method that draws a rectangle for sky, and adjusts the color
     * @param g2 graphics2D object to draw the sky rectangle with
     */
    public void draw(Graphics2D g2)
    
    {
        Rectangle sky = new Rectangle(0, 0, windowWidth, windowHeight);        
        g2.setColor(skyColor);
        g2.draw(sky);
        g2.fill(sky);
    }     
}     


