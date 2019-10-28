import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee1 extends Actor
{
    private String name;
        private int speed;
           private int turnAmount;
    
    public Bee1(){
        this.name=null;
        this.speed=5;
        this.turnAmount=1;
        
    }
           
           
    public void act() 
    {
        move(speed);
        turn(turnAmount);
        
        if(isAtEdge()){
            turn(40);
            
        }
    }    
    
    public String toString(){
        return "bee1";
    }
}
