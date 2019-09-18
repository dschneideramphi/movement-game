import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends SmoothMover
{

    private double Vx = 0;
    private double Vy = 0;
    
    private double gravity = 0.01;
    
    public void act() 
    {
        double x = getExactX();
        double y = getExactY();
        
        if(!isAtEdge()) {
            Vy += gravity;
        } else {
            Vy = 0;
        }
        
        if(Greenfoot.isKeyDown("left")) {
            Vx -= 0.1;
            setImage("left.png");
        }
        
        if(Greenfoot.isKeyDown("right")) {
            Vx += 0.1;
            setImage("right.png");
        }
        
        if(Greenfoot.isKeyDown("up")) {
            Vy -= 0.1;
            setImage("up.png");
        }
        
        if(Greenfoot.isKeyDown("down")) {
            Vy += 0.1;
            setImage("down.png");
        }
        
        
        x += Vx;
        y += Vy;
        
        setLocation(x, y);
    }    
}
