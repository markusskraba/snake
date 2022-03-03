import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.image.*;
import java.awt.geom.*;

public class Playground extends JPanel implements Globals, Components, ActionListener
{
    protected Snake snake;
    protected boolean running;
    protected Timer timer;
    private Controler controler = new Controler();
    protected Random random;
    protected GoodApple goodapple;
    protected BadApple badapple;
    protected Integer applesEaten;
    protected Integer highScore = 0;

    public Playground()
    {
        setVisible(true);
        setFocusable(true);
        this.requestFocusInWindow();
        addKeyListener(controler);
        
        running = false;
        snake = new Snake();
        timer = new Timer(DELAY, this);
        random = new Random();
        applesEaten = 0;
        //startGame();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if(running){

            //drawing of the grid
            /*
            for (int i = 0; i < WINDOW_SIZE_Y / UNIT_SIZE; i++) {
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, WINDOW_SIZE_Y);
            g.drawLine(0, i * UNIT_SIZE, WINDOW_SIZE_X, i * UNIT_SIZE);
            }
            */

            //drawing of good apple
            g.drawImage(goodapple.drawApple(),goodapple.getX(),goodapple.getY(),null);    

            //drawing of bad apple
            g.drawImage(badapple.drawApple(),badapple.getX(),badapple.getY(),null);    

            //drawing of the snake
            for (int i = 0; i < snake.getBodyParts(); i++) {
                if (i == 0) {
                    //color of the snake head
                    switch (snake.getColor()) {
                        case 'r':
                            g.setColor(Color.red);
                            break;

                        case 'g':
                            g.setColor(Color.green);
                            break;

                        case 'b':
                            g.setColor(Color.blue);
                            break;
                    }            
                    g.fillRect(snake.getX(i), snake.getY(i), UNIT_SIZE, UNIT_SIZE);

                } else {

                    //slightly darker colour for the rest of the snake body parts
                    switch (snake.getColor()) {
                        case 'r':
                            g.setColor((new Color(190, 0, 0)));
                            break;

                        case 'g':
                            g.setColor((new Color(0, 190, 0)));
                            break;

                        case 'b':
                            g.setColor((new Color(0, 0, 190)));
                            break;
                    }    
                    g.fillRect(snake.getX(i), snake.getY(i), UNIT_SIZE, UNIT_SIZE);
                }
            }
            
        } else{
            gameOver(g);
        }
    }

    public Snake getSnake(){
        return snake;
    }

    public void startGame() {

        this.requestFocusInWindow();
        setBackground(BACKGROUND_GAME);
        
        //godapple random positiopn
        goodapple = new GoodApple(PATH_GOODAPPLE,random.nextInt((int) ((WINDOW_SIZE_X / UNIT_SIZE)-4))*UNIT_SIZE, random.nextInt((int) (WINDOW_SIZE_Y / UNIT_SIZE)-4)*UNIT_SIZE);

        //badapple random positiopn
        badapple = new BadApple(PATH_BADAPPLE,random.nextInt((int) ((WINDOW_SIZE_X / UNIT_SIZE)-4))*UNIT_SIZE, random.nextInt((int) (WINDOW_SIZE_Y / UNIT_SIZE)-4)*UNIT_SIZE);
        
        running = true;
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            snake.move();
            goodapple.checkApple();
            badapple.checkApple();
            snake.checkCollisions();
        }
        repaint();
    }

    public void gameOver(Graphics g) {
        //Highscore 
        if(applesEaten>highScore){
            highScore = applesEaten;
            container.score.setScore("Dein Highscore ist: "+highScore.toString());
        }
        setBackground(BACKGROUND_GAMEOVER);
        g.setColor(TEXT_COLOR);
        
        g.setFont(SCORE_FONT);
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("SCORE:" + applesEaten, (WINDOW_SIZE_X - metrics1.stringWidth("SCORE: " + applesEaten)) / 2, g.getFont().getSize());

        g.setFont(GAMEOVER_FONT);
        FontMetrics metrics = getFontMetrics(g.getFont());

        //draws text in middle of screen
        g.drawString("GAME OVER", (WINDOW_SIZE_X - metrics.stringWidth("GAME OVER")) / 2, WINDOW_SIZE_Y / 2);
        timer.stop();
    }
}
