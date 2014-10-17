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
        Random randomGen = new Random();        
        Sky sky = new Sky(this.getWidth(), this.getHeight());
        sky.draw(g2);
        MoonOrSun moonOrSun = new MoonOrSun(0, this.getHeight()/8, 100, 100);
        moonOrSun.draw(g2);
        Hill hill = new Hill(0, this.getHeight()-this.getHeight()/4, this.getWidth(), this.getHeight()/4);
        hill.draw(g2);    
        Building building1 = new Building(space, randomGen.nextInt(this.getHeight())-hill.getHillHeight(), space, this.getHeight(), hill);        
        building1.draw(g2);
        Building building2 = new Building(space*3, randomGen.nextInt(this.getHeight())-hill.getHillHeight(), space, this.getHeight(), hill);        
        building2.draw(g2);
        Building building3 = new Building(space*5, randomGen.nextInt(this.getHeight())-hill.getHillHeight(), space, this.getHeight(), hill);        
        building3.draw(g2);
        Building building4 = new Building(space*7, randomGen.nextInt(this.getHeight())-hill.getHillHeight(), space, this.getHeight(), hill);        
        building4.draw(g2);
        Window window1 = new Window(building1);
        window1.draw(g2);
    } 
    
}        

