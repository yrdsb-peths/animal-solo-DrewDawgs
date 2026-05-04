import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        eat();
    }
    //eats apple and spawns new apple when apple is eaten
    public void eat()
    {
        if(isTouching(Orange.class))
        {
            removeTouching(Orange.class);  
            MyWorld world = (MyWorld) getWorld();
            world.createOrange();
            world.increaseScore();
        }
    }
}
