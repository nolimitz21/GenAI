package genai;

import javax.swing.JFrame;

public class GenAI {
    
    private static JFrame gameframe = new JFrame();
    private static GamePanel maingame = new GamePanel();

    public static void main(String[] args) {
        boolean GameRunning = true;
        
        GameSetup();
        
        while(GameRunning)
        {
            GameMainStep();
            GameDraw();
        }
        
    }
    
    private static void GameSetup()
    {
        gameframe.setSize(600,600);
        gameframe.setContentPane(maingame);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BusyBee obj = new BusyBee();
        maingame.addEntity(obj);
        maingame.addMouseListener(maingame);
        gameframe.setVisible(true);
    }
    
    private static void GameMainStep()
    {
        
    }
    
    private static void GameDraw()
    {
        maingame.repaint();
    }
    
}
