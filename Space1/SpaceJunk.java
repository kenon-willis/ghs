import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceJunk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceJunk extends Actor
{
    /**
     * Act - do whatever the SpaceJunk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int flightTime;
    private int speed;
    
    public SpaceJunk(int speed){
        this.speed = speed;
        this.flightTime=0;
        
    }
    
    public void act() 
    {
        // Add your action code here.
        flightTime++;
        
        setLocation(getX(), getY()-speed);
        
        if(this.getY()<=0){
            resetPosition();
        }
        
        if(isTouching(Spaceship.class)){
            getWorld().removeObject(this);
        }
    }    
    public int getFlightTime(){
        return this.flightTime;
    }
    public void resetPosition(){
            
            int x=Greenfoot.getRandomNumber(1000);
            
            setLocation( x,700);
       
    }
}



