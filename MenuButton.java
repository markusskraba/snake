import java.awt.event.*;

public class MenuButton extends Buttons implements Components, Globals
{
    private int identifier;
    
    public MenuButton(String s, int identifier)
    {
        super(s);
        this.identifier = identifier;
        
        setFocusable(false);
        

    }
    
    @Override public void mouseClicked(MouseEvent e) {
        
        // to address buttons
        Game.container.setFocusable(false);
        if(identifier == 1 ) {
            container.nextCard();
            playground.startGame();
            
        } else if( identifier == 2){
            container.optionsCard();
            
        } else if (identifier == 3){
            container.scoreCard();
            
        } else if (identifier == 4){
            System.exit(0);
        } else if (identifier == 5){
            container.menuCard();
            playground.running = false;
            playground.snake.setX(0,WINDOW_SIZE_X/2);
            playground.snake.setY(0,WINDOW_SIZE_Y/2);
            playground.snake.setBodyParts(4);
            playground.applesEaten = 0;
            controlpanel.applesEatenLabel.setText("0");
        }
        
        // tried switch first, didn't work
        // switch(identifier){
            // case 1:
                // System.out.println("eins");
                // container.nextCard();
                // playground.startGame();
            // case 2: 
                // System.out.println("zwei");
                // container.nextCard();
        // }
        
    }
    
    
    
    


}
