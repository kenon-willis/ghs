import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
public class Sub1
{
    public static void main(){
        
        
        String phrase = JOptionPane.showInputDialog("Phrase:");
        
        System.out.println(subEncrypt(phrase));
        phrase = JOptionPane.showInputDialog("Phrase:");
        
        System.out.println(subDecrypt(phrase));
        
        
    }
    
    public static String subEncrypt(String phrase){
        
        String answer="";
        ArrayList<String> myList1=new ArrayList<String>(Arrays.asList ("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        ArrayList<String> myList2=new ArrayList<String>(Arrays.asList ("t","u","v","w","x","y","z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"));
        
        for(int i=0; i<phrase.length(); i++){
            
                String letter = phrase.substring(i,i+1);
                int spot = myList1.indexOf(letter);
                if(spot!=-1){
                
                
                answer+=myList2.get(spot);
            }
            else{
                
                answer+=letter;
            }
            
            
        }
        return answer;
        
        
        
        
    }
    
    
    
    
    public static String subDecrypt(String phrase){
        
        String answer="";
         ArrayList<String> myList1=new ArrayList<String>(Arrays.asList ("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        ArrayList<String> myList2=new ArrayList<String>(Arrays.asList ("t","u","v","w","x","y","z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"));
        
        for(int i=0; i<phrase.length(); i++){
            
                String letter = phrase.substring(i,i+1);
                int spot = myList2.indexOf(letter);
                if(spot!=-1){
                
                
                answer+=myList1.get(spot);
            }
            else{
                
                answer+=letter;
            }
            
            
        }
        return answer;
        
        
        
        
    }
}