import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends SmoothMover
{

    private double Vx = 0;
    private double Vy = 0;
    
    private double speedYConst = -5;
    private double speedXConst = 0.1;
    
    private double gravity = 0.1;
    
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
            Vx -= speedXConst;
            setImage("left.png");
        }
        
        if(Greenfoot.isKeyDown("right")) {
            Vx += speedXConst;
            setImage("right.png");
        }
        
        if(Greenfoot.isKeyDown("up")) {
            Vy = speedYConst;
            setImage("up.png");
        }
        
        if(Greenfoot.isKeyDown("down")) {
            Vy += speedYConst;
            setImage("down.png");
        }
        
        
        x += Vx;
        y += Vy;
        
        setLocation(x, y);
    }    
}
