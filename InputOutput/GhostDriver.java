
public class GhostDriver
{
    public static void main(){
        
        
        
        
        Ghost g4 = new Ghost("chartruse", 99,10);
        
        System.out.println(g4.toString());
        
        g4.bumpSpeed(17);
       
        System.out.println(g4.toString());
        
        g4.bumpSpeed();  //increase speed of Ghost4 by 1
        
        System.out.println(g4.toString());
        
        g4.doubleColor();
        
        System.out.println(g4.toString());
        
        
        
    }
}
