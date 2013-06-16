package genai;

import java.awt.Graphics;

public class BusyBee implements GameEntity
{
    private int x;
    private int y;
    private int size;
    
    public BusyBee()
    {
        x = 10;
        y = 10;
        size = 10;
    }
    
    public BusyBee(int x, int y, int size)
    {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, size, size);
    }

    @Override
    public void mainStep() {
        
    }
    
}
