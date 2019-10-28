import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed;
    private String name;
    
    public Bee(){
        this.speed=1;
        this.name=null;
    }
    
    public Bee(int s, String n){
        this.speed=s;
        this.name=n;
    }
    
    
    public void act() 
    {
        // Add your action code here.
        move(this.speed);
        
        if(isAtEdge()){
            turn((int)(Math.random()*90+1));
        }
        
        if(this.speed==1)
        getWorld().showText(this.toString(), getWorld().getWidth()/2,getWorld().getHeight()/2);
        else
        getWorld().showText(this.toString(), getWorld().getWidth()/4,getWorld().getHeight()/4);
    }    
    
    
    public String toString(){
        return this.name+"\n" + this.speed + "\n" + this.getX() + "\n" + this.getY();
        
    }
}
