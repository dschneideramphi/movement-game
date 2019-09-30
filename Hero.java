import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends SmoothMover
{

    private double Vx = 0;
    private double Vy = 0;
    private double speed = 5;
    private int direction = 0;
    
    public void act() 
    {
        
        
        double x = getExactX();
        double y = getExactY();
        
        if(Greenfoot.getKey() == "space") {
            Ball b = new Ball(direction);
            getWorld().addObject(b, (int) x, (int) y);
        }
        
        
        if(Greenfoot.isKeyDown("up")) {
            if(Vy >= -1*speed) {
                Vy -= 0.2;
            }
            setImage("up.png");
            direction = 0;
        }
        
        if(Greenfoot.isKeyDown("down")) {
            if(Vy <= speed) {
                Vy += 0.2;
            }
            setImage("down.png");
            direction = 2;
        }
        
        if(Greenfoot.isKeyDown("left")) {
            if(Vx > -1*speed) {
                Vx -= 0.2;
            }
            setImage("left.png");
            direction = 3;
        }
        
        if(Greenfoot.isKeyDown("right")) {
            if(Vx < speed) {
                Vx += 0.2;
            }
            setImage("right.png");
            direction = 1;
        }
        
        x += Vx;
        y += Vy;
        
        if(x > 500) {
            x = 0;
        }
        if(x < 0) {
            x = 500;
        }
        if(y > 500) {
            y = 0;
        }
        if(y < 0) {
            y = 500;
        }
        
        setLocation(x, y);
    }    
}
