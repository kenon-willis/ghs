
public class College
{
    private String name;
    private int tuition;
    private boolean scholarship;
    public College(String n, int t, boolean s)
    {
        name = n;
        tuition=t;
        scholarship=s;
    }
    
    public int getTuition(){
        return this.tuition;
    }
    public boolean getScholarship(){
        return this.scholarship;
    }
    
    public String toString(){
        
        return this.name+" " + this.tuition+" " + this.scholarship;
        
    }
}
