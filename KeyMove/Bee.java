import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
    public Bee(){
        this.speed=1;
    }
    
    public void act() 
    {
        // Add your action code here.
        move(this.speed);
        
        if(Greenfoot.mouseClicked(this)){
            this.speed++;
        }
        
        if(Greenfoot.isKeyDown("a")){
            turn(4);
            
        }
    }    
}
