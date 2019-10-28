import java.util.ArrayList;
public class SubstringAndForEach
{
    public static void main(){
        
        String[] cereals = {"Cheerios", "Kashi", "Granola", "Special K"};
        
        //arrayList of Strings called animals
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("lizard");
        animals.add("liger");
        animals.add("sea monkeys");
        animals.add("prairie dog");
        
        //foreach loop
        for(String c: cereals){
            System.out.println(c);
        }
        
        for(String currAnimal: animals){
            System.out.println(currAnimal);
        }
        
        
    }
}
