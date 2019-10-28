import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InputOutput
{
   
    public static void main(){
        ArrayList<String> elementList = new ArrayList<String>();
        
        elementList.add("argon");
        elementList.add("boron");
        elementList.add("carbon");
        elementList.add("flourine");
        elementList.add("gold");
        elementList.add("iron");
        elementList.add("livermorium"); 
        
        System.out.println("Here are the elements...");
        
        for(int i=0; i<elementList.size(); i++){
            
            System.out.println(elementList.get(i));
            
            
            
        }
        
        elementList.add(1,"bismuth");
        elementList.set(3,"cobalt");
        
        System.out.println("\nHere are the elements, with some changes...");
        
        for(int i=0; i<elementList.size(); i++){
            
            System.out.println(elementList.get(i));
            
            
            
        }
        
        
        System.out.println("\nHere are the elements containing 'on'...");
        
        for(int i=0; i<elementList.size(); i++){
            
            if(elementList.get(i).contains("on")){
            System.out.println(elementList.get(i));
        }
            
            
            
        }
        
        System.out.println("\nRemoving all elements starting with 'd' and after...");
        
        for(int i=0; i<elementList.size(); i++){
            
            if(elementList.get(i).substring(0,1).compareTo("d")>=0){
            elementList.remove(i);
            i--;
        }
            
            
            
        }
        
        
        
        for(int i=0; i<elementList.size(); i++){
            
            
            System.out.println(elementList.get(i));
        
            
            
            
        }
        
        

    }
}