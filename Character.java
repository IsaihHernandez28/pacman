import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character extends Actor
{
    public static final int DIRECTION_RIGHT = 0;
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_UP = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int OFFSET = 5;
    
    public int direction = DIRECTION_RIGHT;    
    
    public void act()
    {
        moveCharacter();
    }
    public void moveCharacter()
    {
        int nextX = getX();
        int nextY = getY();

        switch(direction)
        {
            case DIRECTION_RIGHT:
                nextX += OFFSET;
                break;
            case DIRECTION_LEFT:
                nextX -= OFFSET;
                break;
            case DIRECTION_UP:
                nextY -= OFFSET;
                break;
            case DIRECTION_DOWN:
                nextY += OFFSET;
                break;
        }
        Actor nextObject = getOneObjectAtOffset(nextX - getX(), nextY - getY(), Wall.class);

        if (nextObject == null || ((Wall) nextObject).isTraversable()) 
        {
            setLocation(nextX, nextY);
        }
    }
}
