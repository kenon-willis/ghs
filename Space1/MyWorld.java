import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        for(int i=0; i<10; i++){
            int y=Greenfoot.getRandomNumber(500);
            int x=Greenfoot.getRandomNumber(1000);
            int speed=Greenfoot.getRandomNumber(6)+2;
            addObject(new SpaceJunk(speed), x,700-y);
        }
         
        
        addObject(new Spaceship(7), 100,100);
        
        
    }
}
