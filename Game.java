import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;


public class Game extends  JFrame implements Components, Globals
{
    //static JPanel container = new JPanel();
    //JButton btn = new JButton();
    
    public Game()
    {
        //JFrame specs
        this.setLayout(borderlayout);
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_SIZE_X,WINDOW_SIZE_Y);
        
        //add den Container der ein cardLayout hat == klasse PLace
        add(container,borderlayout.CENTER);
        setResizable(false);
        setVisible(true);
        setFocusable(false);
        setLocationRelativeTo(null);
    }
    

    public static void main( String[] args){
        
        //make new Game
         try{
             Game game = new Game();

        } catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }


  
}
