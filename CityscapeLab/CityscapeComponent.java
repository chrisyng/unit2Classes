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
    private boolean isNight=true;    
    /**
     * PaintComponent instantiates objects of the cityscape objects and draws them.
     *
     * @pre       predefined sky, building, hill, and moon classes
     * @post      a fully drawn cityscape!
     */    
    
    public void paintComponent(Graphics g)
    {       
        Graphics2D g2 = (Graphics2D) g;
        int space = this.getWidth()/9; 
        Random randomGen = new Random();        
        Sky sky = new Sky(this.getWidth(), this.getHeight(), this);
        sky.draw(g2);        
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
        MoonOrSun moonOrSun = new MoonOrSun(0, this.getHeight()/8, 100, 100);
        moonOrSun.drawMoon(g2);        
        
        while (moonOrSun.getXPos() < this.getWidth())
        {
            while (isNight)
            {                
                moonOrSun.changePos();
                moonOrSun.drawMoon(g2);
                this.repaint();
                if (moonOrSun.getXPos() >= this.getWidth())
                {
                    isNight = false;
                    moonOrSun.resetPos();
                }
            }
            while (!isNight)
            {                
                moonOrSun.changePos();
                moonOrSun.drawSun(g2);
                this.repaint();
                if (moonOrSun.getXPos() >= this.getWidth())
                {
                    isNight = true;
                    moonOrSun.resetPos();
                }
            }
        } 
    }
    
    public boolean getNight()
    /**
     * Returns whether or not the CityScape is in night or day
     */
    {
        return this.isNight;
    }    
}        

