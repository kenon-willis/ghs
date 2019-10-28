import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        
        for(int i=1; i<10; i++){
         for(int j=1; j<10; j++){   
                addObject(new Bee(),i*70,j*60);
        
    }
    }
}
}
