import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
public class Caesar1
{
    public static void main(){
        
        
        String phrase = JOptionPane.showInputDialog("Phrase:");
        int push = Integer.parseInt(JOptionPane.showInputDialog("Phrase:"));
        System.out.println(caesarEncrypt(phrase,push));
        phrase = JOptionPane.showInputDialog("Phrase:");
        push = Integer.parseInt(JOptionPane.showInputDialog("Phrase:"));
        System.out.println(caesarDecrypt(phrase,push));
        
        
    }
    
    public static String caesarEncrypt(String phrase, int push){
        
        String answer="";
        ArrayList<String> myList=new ArrayList<String>(Arrays.asList ("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        
        for(int i=0; i<phrase.length(); i++){ 
                String letter = phrase.substring(i,i+1); //selects one letter from the phrase
                int spot = myList.indexOf(letter); //get letter index in the array, letter val
                if(spot!=-1){ //only if the letter is in the array
                
                spot+=push; //change letter val
                spot%=myList.size(); //if it goes over 26, start at the beginning again
                answer+=myList.get(spot); //adds the letter corresponding from the array
            }
            else{ //if it isnt in the array it stays the same
                
                answer+=letter;
            
        }
        return answer; // returns full message
        
        
        
        
    }
    
    
    
    
    public static String caesarDecrypt(String phrase, int push){
        
        String answer="";
        ArrayList<String> myList=new ArrayList<String>(Arrays.asList ("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        
        for(int i=0; i<phrase.length(); i++){
            
                String letter = phrase.substring(i,i+1);
                int spot = myList.indexOf(letter);
                if(spot!=-1){
                
                spot-=push;
                    if(spot<0){
                    
                        spot=myList.size()+spot;
                    }
                answer+=myList.get(spot);
            }
            else{
                
                answer+=letter;
            }
            
            
        }
        return answer;
        
        
        
        
    }
}
