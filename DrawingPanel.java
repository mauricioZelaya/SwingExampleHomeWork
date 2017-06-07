import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Write a description of class DrawingPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    private Color color;
    public DrawingPanel(){
        setBackground(Color.GRAY);
        color = new Color(245, 253, 1);
        addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent event){
                System.out.println(String.format("click at: %s, %s", event.getX(), event.getY()));                
                changePanelColor(event);
                setOvalColor(event);
            }
        });
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(color);
        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;
        
        g.fillOval(xCenter - 50/2, yCenter - 50/2, 50, 50);
        
    }
    private void changePanelColor(MouseEvent event){
        Color background;
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        background = getBackground();
        setBackground(new Color(r,g,b));
        repaint();
    }
    private void setOvalColor(MouseEvent event) {                                          
        Color background;
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        color = new Color(r,g,b);
        repaint();
    } 
}

