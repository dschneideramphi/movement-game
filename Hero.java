import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{

    private int Vx = 0;
    private int Vy = 0;
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("left")) {
            Vx -= 1;
            setImage("left.png");
        }
        
        if(Greenfoot.isKeyDown("right")) {
            Vx += 1;
            setImage("right.png");
        }
        
        if(Greenfoot.isKeyDown("up")) {
            Vy -= 1;
            setImage("up.png");
        }
        
        if(Greenfoot.isKeyDown("down")) {
            Vy += 1;
            setImage("down.png");
        }
        
        x += Vx;
        y += Vy;
        
        setLocation(x, y);
    }    
}
