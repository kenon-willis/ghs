
public class Dog
{
    private String name;
    private String breed;
    private double weight;
    public Dog()
    {
        this.name = null;
        this.breed = null;
        this.weight = 0.0;
    }
    public Dog(String dogN, String dogB, double dogW)
    {
        this.name = dogN;
        this.breed = dogB;
        this.weight = dogW;
    }
    
    //return type is a double
    public double getWeight(){
        return this.weight;
    }
    
    public String toString(){
       return this.name + " is a " + this.breed + " and weighs " + this.weight + " lbs";
    }
}
