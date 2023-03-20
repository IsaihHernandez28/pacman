import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ghost extends Character
{
    public void act()
    {
        super.moveCharacter();
    }
    private void checkCollisions()
    {
        Wall wall = (Wall)this.getOneIntersectingObject(Wall.class);
        
        if(wall != null)
        {
            direction *= -1;
        }
    }
}
