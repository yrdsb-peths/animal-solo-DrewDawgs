import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Bee", 100);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 100);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,295,111);
        bee.animateBee();
        bee.setLocation(252,110);
        bee.setLocation(427,117);
        Orange orange = new Orange();
        addObject(orange,253,178);
        bee.setLocation(417,131);
        orange.setLocation(137,290);
        orange.setLocation(494,126);
        bee.setLocation(429,125);
        orange.setLocation(479,117);
        orange.setLocation(493,121);
        bee.setLocation(427,122);
        bee.setLocation(411,122);
        bee.setLocation(410,127);
        orange.setLocation(476,132);
        orange.setLocation(476,117);
        orange.setLocation(479,117);
        orange.setLocation(522,105);
        Orange orange2 = new Orange();
        addObject(orange2,522,105);
        orange.setLocation(533,120);
        orange2.setLocation(539,132);
        orange2.setLocation(531,109);
        orange2.setLocation(532,115);
        orange.setLocation(493,137);
        orange.setLocation(493,137);
        orange.setLocation(475,118);
        orange2.setLocation(479,126);
        orange2.setLocation(479,145);
        orange.setLocation(521,101);
        orange.setLocation(475,133);
        orange.setLocation(530,136);
        orange.setLocation(527,133);
        orange2.setLocation(476,135);
        orange2.setLocation(486,178);
        orange.setLocation(554,188);
        bee.setLocation(414,183);
        orange.setLocation(556,185);
        orange.setLocation(554,176);
        orange.setLocation(548,176);
        orange2.setLocation(489,184);
        Label label = new Label("press <space> to start", 50);
        addObject(label,135,278);
        label.setLocation(352,272);
        label.setLocation(373,278);
        label.setLocation(331,278);
        label.setLocation(321,278);
        label.setLocation(288,278);
        Label label2 = new Label("use \u2190 and \u2192 to move", 40);
        addObject(label2,274,349);
        label2.setLocation(321,346);
        label.setLocation(394,282);
        label.setLocation(420,282);
        label.setLocation(275,290);
        label2.setLocation(264,353);
        label.setLocation(336,302);
        label.setLocation(299,294);
        label2.setLocation(325,343);
        label2.setLocation(321,337);
        label2.setLocation(289,336);
        label2.setLocation(297,334);
        label2.setLocation(235,346);
        orange2.setLocation(481,214);
        bee.setLocation(432,202);
        bee.setLocation(336,193);
        bee.setLocation(189,193);
        orange2.setLocation(469,188);
        orange2.setLocation(458,192);
        removeObject(orange2);
        removeObject(orange);
        bee.setLocation(290,201);
    }
}
