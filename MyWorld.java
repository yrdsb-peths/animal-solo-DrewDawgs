import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        
        Bee bee = new Bee();
        addObject (bee, 300, 200);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createOrange();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);        
    }
    
    
    public void createOrange()
    {
        Orange orange = new Orange();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(orange, x, y);
    }
}
