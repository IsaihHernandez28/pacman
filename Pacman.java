import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pacman extends Character
{
    private static final int COUNT_DOWN_START_VALUE = 20;
        
    private int mouthDelay = 10;
    
    private String [][]images;
    
    private int imageIndex;
    private int score;
    
    public Pacman()
    {        
        prepareImagesCollection();
        setImage(images[DIRECTION_RIGHT][0]);
    }   
    public void act()
    {
        super.moveCharacter();
        handleKeys();
        handleImageSelector();
        checkCollisions();
        updateHud();
//        intersectingObject();
    }
    private void checkCollisions()
    {
        Item item = (Item)this.getOneIntersectingObject(Item.class);
        
        if(item != null)
        {
            score += item.getPoints();
            this.getWorld().removeObject(item);
        }
    }
    private void updateHud()
    {
        World world = getWorld();
        
        world.showText("Score: " + score, world.getWidth() - 100, 20);
    }
    private void prepareImagesCollection()
    {
        images = new String[5][];
        
        images[DIRECTION_RIGHT] = new String[]{
            "images/pacman-close.png",
            "images/pacman-open.png"
        };
        
        images[DIRECTION_LEFT] = new String[]{
            "images/pacman-close-left.png",
            "images/pacman-open-left.png"
        };
        images[DIRECTION_UP] = new String[]{
            "images/pacman-close-up.png",
            "images/pacman-open-up.png"
        };
        
        images[DIRECTION_DOWN] = new String[]{
            "images/pacman-close-down.png",
            "images/pacman-open-down.png"
        };
    }
    private void handleKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            direction = DIRECTION_LEFT;
        } else if(Greenfoot.isKeyDown("right")){
            direction = DIRECTION_RIGHT;
        } else if(Greenfoot.isKeyDown("up")){
            direction = DIRECTION_UP;
        } else if(Greenfoot.isKeyDown("down")){
            direction = DIRECTION_DOWN;
        }
    }
    private void handleImageSelector()
    {
        mouthDelay--;
        if(mouthDelay == 0)
        {
            imageIndex = (imageIndex + 1) % images[direction].length;
            
            setImage(images[direction][imageIndex]);
            mouthDelay = COUNT_DOWN_START_VALUE;
        }
    }
}
