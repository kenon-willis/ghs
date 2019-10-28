import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    private String name;
        private int speed;
           private int turnAmount;
           private int c;
    
    public Bee(){
        this.name=null;
        this.speed=5;
        this.turnAmount=1;
        this.c=0;
    }
           
           
    public void act() 
    {
        move(speed);
        turn(turnAmount);
        
        if(isAtEdge()){
            turn(40);
            
        }
        
        if(isTouching(Bee1.class)){
            this.c++;
            System.out.println("count " + c);
        }
        
        getWorld().showText(this.toString(), 40,40);
    }    
    
    
    public String toString(){
        return "bee";
    }
}
