import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{

    public void act() 
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left")) {
            x = x - 5;
            setImage("left.png");
        }
        if(Greenfoot.isKeyDown("right")) {
            x = x + 5;
            setImage("right.png");
        }
        if(Greenfoot.isKeyDown("up")) {
            y = y - 5;
            setImage("up.png");
        }
        if(Greenfoot.isKeyDown("down")) {
            y = y + 5;
            setImage("down.png");
        }
        setLocation(x, y);
    }    
}
