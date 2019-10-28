
public class SmartKidDriver
{
   public static void main(){
       
       double[] myGrades = new double[]{3.0,4.0,1.0,4.0,4.0};
       
       SmartKid kiddo1 = new SmartKid(myGrades);
       
       System.out.println(kiddo1.calcGPA());
       
       
       
       
    }
}
