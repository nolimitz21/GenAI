package genai;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements MouseListener
{
    
    private ArrayList<GameEntity> EntityList = new ArrayList<>();
    
    @Override
    public void paint(Graphics g)
    {
        for(GameEntity entity: EntityList)
        {
            entity.draw(g);
        }
    }
    
    public void addEntity(GameEntity ent)
    {
        EntityList.add(ent);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        this.addEntity(new BusyBee(e.getX(),e.getY(),10));
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        
    }
}
