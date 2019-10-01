import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ball extends SmoothMover
{
    
    private double vX;
    private double vY;
    
    public Ball(int direction) {
        
        if(direction == 0) {
            //Facing Up
            vX = 0;
            vY = -1;
        }
        if(direction == 1) {
            vX = 1;
            vY = 0;
        }
        if(direction == 2) {
            vX = 0;
            vY = 1;
        }        
        if(direction == 3) {
            vX = -1;
            vY = 0;
        }
    }
    
    public void act() 
    {
        double x = getExactX();
        double y = getExactY();
        
        
        x = x + vX;
        y = y + vY;
        
        setLocation(x, y);
        
        if(y < -5 || y > 505 || x < -5 || x > 505) {
            //We're off the screen! Mayday mayday!!!!
            getWorld().removeObject(this);
        }
        
    }    
}
