import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Tree extends Actor
{
    private List<Bee> beeList;
  
    
    public void act() 
    {
        // Add your action code here.
        beeList = getWorld().getObjects(Bee.class);
        System.out.println(beeList.size());
        
    }    
}
