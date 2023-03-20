import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pacman pacman = new Pacman();
        addObject(pacman,88,87);
        pacman.setLocation(89,83);

        addObject(new Wall(),25,25);
        addObject(new Wall(),25,75);
        addObject(new Wall(),25,125);
        addObject(new Wall(),25,175);
        addObject(new Wall(),25,225);
        addObject(new Wall(),25,275);
        addObject(new Wall(),25,325);
        addObject(new Wall(),25,375);
        addObject(new Wall(),25,425);
        addObject(new Wall(),25,475);
        addObject(new Wall(),25,525);
        addObject(new Wall(),25,575);

        addObject(new Wall(),75,575);
        addObject(new Wall(),125,575);
        addObject(new Wall(),175,575);
        addObject(new Wall(),225,575);
        addObject(new Wall(),275,575);
        addObject(new Wall(),325,575);
        addObject(new Wall(),375,575);
        addObject(new Wall(),425,575);
        addObject(new Wall(),475,575);
        addObject(new Wall(),525,575);
        addObject(new Wall(),575,575);
        addObject(new Wall(),625,575);
        addObject(new Wall(),675,575);
        addObject(new Wall(),725,575);
        addObject(new Wall(),775,575);
        addObject(new Wall(),825,575);
        addObject(new Wall(),875,575);
        addObject(new Wall(),925,575);
        addObject(new Wall(),975,575);
        addObject(new Wall(),1025,575);
        addObject(new Wall(),1075,575);

        addObject(new Wall(),1075,525);
        addObject(new Wall(),1075,475);
        addObject(new Wall(),1075,425);
        addObject(new Wall(),1075,375);
        addObject(new Wall(),1075,325);
        addObject(new Wall(),1075,275);
        addObject(new Wall(),1075,225);
        addObject(new Wall(),1075,175);
        addObject(new Wall(),1075,125);
        addObject(new Wall(),1075,75);
        addObject(new Wall(),1075,25);

        addObject(new Wall(),1025,25);
        addObject(new Wall(),975,25);
        addObject(new Wall(),925,25);
        addObject(new Wall(),875,25);
        addObject(new Wall(),825,25);
        addObject(new Wall(),775,25);
        addObject(new Wall(),725,25);
        addObject(new Wall(),675,25);
        addObject(new Wall(),625,25);
        addObject(new Wall(),575,25);
        addObject(new Wall(),525,25);
        addObject(new Wall(),475,25);
        addObject(new Wall(),425,25);
        addObject(new Wall(),375,25);
        addObject(new Wall(),325,25);
        addObject(new Wall(),275,25);
        addObject(new Wall(),225,25);
        addObject(new Wall(),175,25);
        addObject(new Wall(),125,25);
        addObject(new Wall(),75,25);

        addObject(new Wall(),175,75);
        addObject(new Wall(),175,125);
        addObject(new Wall(),175,175);
        addObject(new Wall(),175,225);
        addObject(new Wall(),175,275);
        addObject(new Wall(),175,525);
        addObject(new Wall(),175,475);
        addObject(new Wall(),175,425);

        addObject(new Wall(),225,175);
        addObject(new Wall(),275,175);
        addObject(new Wall(),325,175);
        addObject(new Wall(),375,175);
        addObject(new Wall(),425,175);
        addObject(new Wall(),475,175);

        addObject(new Wall(),225,425);
        addObject(new Wall(),275,425);
        addObject(new Wall(),325,425);
        addObject(new Wall(),375,425);
        addObject(new Wall(),425,425);
        addObject(new Wall(),425,375);
        addObject(new Wall(),425,325);
        addObject(new Wall(),475,325);
        addObject(new Wall(),525,325);
        addObject(new Wall(),575,325);
        addObject(new Wall(),625,325);
        addObject(new Wall(),675,325);
        addObject(new Wall(),725,325);

        addObject(new Wall(),625,275);
        addObject(new Wall(),625,225);
        addObject(new Wall(),625,175);

        addObject(new Wall(),675,175);
        addObject(new Wall(),725,175);
        addObject(new Wall(),775,175);
        addObject(new Wall(),825,175);
        addObject(new Wall(),875,175);
        addObject(new Wall(),925,175);

        addObject(new Wall(),925,225);
        addObject(new Wall(),925,275);
        addObject(new Wall(),925,325);
        addObject(new Wall(),925,375);
        addObject(new Wall(),925,425);
        Apple apple = new Apple();
        addObject(apple,238,501);
        Banana banana = new Banana();
        addObject(banana,246,92);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,708,252);
        SmallItem smallItem = new SmallItem();
        addObject(smallItem,993,96);
        Cherry cherry = new Cherry();
        addObject(cherry,504,401);
        BigItem bigItem = new BigItem();
        addObject(bigItem,260,260);
        SmallItem smallItem2 = new SmallItem();
        addObject(smallItem2,900,99);
        smallItem2.setLocation(886,96);
        smallItem2.setLocation(544,102);
        SmallItem smallItem3 = new SmallItem();
        addObject(smallItem3,348,354);
        SmallItem smallItem4 = new SmallItem();
        addObject(smallItem4,106,351);
        SmallItem smallItem5 = new SmallItem();
        addObject(smallItem5,834,264);
        BigItem bigItem2 = new BigItem();
        addObject(bigItem2,986,495);
        BigItem bigItem3 = new BigItem();
        addObject(bigItem3,783,98);
        BigItem bigItem4 = new BigItem();
        addObject(bigItem4,530,245);
        BigItem bigItem5 = new BigItem();
        addObject(bigItem5,101,493);
        SmallItem smallItem6 = new SmallItem();
        addObject(smallItem6,100,216);
        Ghost ghost = new Ghost();
        addObject(ghost,726,415);
        removeObject(ghost);
    }
}
