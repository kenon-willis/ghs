



















import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    List<SpaceJunk> junkList;
    private int speed;
    private int balloonTime;
    private int popped;
    public Spaceship(int s){
        
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
        
        speed=s;
        balloonTime=0;
        popped=0;
        
        
    }
    
    public void act() 
    {
        // Add your action code here.
        junkList=getWorld().getObjects(SpaceJunk.class);
        
        
        getWorld().showText("Popped: " + (10-junkList.size()),500,300);
        getWorld().showText("Total Balloon Flight Time: " + totalBalloonFlightTime(),500,350);
        move(this.speed);
        
        if(Greenfoot.isKeyDown("s")){
            setRotation(0);
            
        }
        if(Greenfoot.isKeyDown("a")){
            setRotation(180);
            
        }
        
        
        if(junkList.size()==0){
            this.speed=0;
        }
    }    
    
    public int totalBalloonFlightTime(){
        balloonTime=0;
        for (SpaceJunk b: junkList){
            balloonTime=b.getFlightTime();
            
        }
        
        return this.balloonTime;
    }
}
















