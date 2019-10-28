import javax.swing.JOptionPane;


public class ArraysAndStuff
{
    public static void main(){
        
        String state="california";
        String city="livermore";
        
        String a1=JOptionPane.showInputDialog("state?");
        a1=a1.toLowerCase();
        if(a1.compareTo(state) < 0){
            
            System.out.println("your state is too early in the alphabet");
            
        }
        else if (a1.compareTo(state) > 0){
            
            System.out.println("your state is too late in the alphabet");
        }
        else
        {
            String a2=JOptionPane.showInputDialog("city?");
            a2=a2.toLowerCase();
        
                if(a2.compareTo(city) < 0){
                    
                    System.out.println("your city is too early in the alphabet");
                    
                }
                else if (a2.compareTo(city) > 0){
                    
                    System.out.println("your city is too late in the alphabet");
                }
                else
                {
                    boolean valid=false;
                    
                    while(!valid){
                        
                        String a3=JOptionPane.showInputDialog("password?");
                        
                        if(a3.length()>6 && (a3.contains("%") || a3.contains("*") || a3.contains("!"))){
                            
                            valid=true;
                            
                        }
                        
                        
                        
                        
                    }
                    
                    
                    
                    
                }
            
        }
        
        
    }
}
