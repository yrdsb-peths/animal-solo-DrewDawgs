import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Bee bee = new Bee();
        
        addObject (bee, 300, 100);
    }
}
