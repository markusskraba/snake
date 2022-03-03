import javax.swing.*;


public class Place extends JLabel implements Components
{
    // container with CardLayout
    Score score = new Score();
    Options optio = new Options();
    public Place()
    {
        setLayout(cardlayout);
        
        // add Menu JPanel and Game (GameContainer)
        // options and highscore should also be displayed
        add("menu",menu);
        add("spiel", spiel);
        
        this.add("opt", optio);
        add("score",score);
        setFocusable(false);
        
        
    }
    
    
    // move in CardLayout 
    public void nextCard(){    
    
    cardlayout.next(this);    
    } 
    
    public void menuCard(){
        cardlayout.first(this);    
    }
    
    // switch to Options card
    public void optionsCard(){
        cardlayout.show(this,"opt");
    }
    
    public void scoreCard(){
        cardlayout.show(this,"score");
    }

}
