import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    public static boolean isNight=true;
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */    
    
    public void paintComponent(Graphics g)
    {       
        Graphics2D g2 = (Graphics2D) g;
        int space = this.getWidth()/9;        
        int windowHeight = this.getHeight();
        Random randomGen = new Random();        
        Sky sky = new Sky(this.getWidth(), this.getHeight());
        sky.draw(g2);
        Moon moon = new Moon(0, windowHeight/8, 100, 100);
        moon.draw(g2);
        Hill hill = new Hill(0, this.getHeight()-this.getHeight()/4, this.getWidth(), this.getHeight()/4);
        hill.draw(g2);        
        int hillHeight = hill.getHillHeight();
        Building building1 = new Building(space, randomGen.nextInt(windowHeight)-hill.getHillHeight(), space, windowHeight);
        building1.setHillHeight(hillHeight);
        building1.draw(g2);
        Building building2 = new Building(space*3, randomGen.nextInt(windowHeight)-hill.getHillHeight(), space, windowHeight);
        building2.setHillHeight(hillHeight);
        building2.draw(g2);
        Building building3 = new Building(space*5, randomGen.nextInt(windowHeight)-hill.getHillHeight(), space, windowHeight);
        building3.setHillHeight(hillHeight);
        building3.draw(g2);
        Building building4 = new Building(space*7, randomGen.nextInt(windowHeight)-hill.getHillHeight(), space, windowHeight);
        building4.setHillHeight(hillHeight);
        building4.draw(g2);
    }
}        

