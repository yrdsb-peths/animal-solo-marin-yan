import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        GreenfootImage bg = new GreenfootImage("images/background.png");
        getBackground().drawImage(bg, 0, 0);
        
        // Create the elephant object
        
        Elephant elephant = new Elephant();
        addObject(elephant,300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
    }
    
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
