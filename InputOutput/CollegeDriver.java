


public class CollegeDriver
{
    public static void main(){
        
        CollegeList n = new CollegeList();
        
        System.out.println(n);
        //System.out.println("\n");
        
        System.out.println("Removing " + n.removeNonBudgetColleges()+ " colleges with the removeNonBudgetColleges() method");
        
        
        System.out.println(n);
        //System.out.println("\n");
        
        n.makeRoomForAlternates();
        System.out.println("After making room for alternates...");
        
        System.out.println(n);
        
    }
}
