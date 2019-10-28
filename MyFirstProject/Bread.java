import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends Actor
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        //move the object one pixel
        move(10);
        
        //check if the object is at edge, if yes then bounce
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(90));
        }
        
        //if Bread touches Bread, breed a new Bread
        if(isTouching(Bread.class)){
            getWorld().addObject(new Bread(), 100,100);
        }
    }    
}
