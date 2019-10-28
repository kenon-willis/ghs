import java.util.ArrayList;
public class CollegeList
{
    
    College[] publicSchools;
    ArrayList<College> privateSchools;
    
    public CollegeList(){
        publicSchools=new College[]{new College("UCLA",20000,false),new College("UT Austin",40000,false),new College("Michigan",40000,false),new College("Cal State LA",5000,true)};
        
        privateSchools=new ArrayList<College>();
        privateSchools.add(new College("USC",60000,true));
        privateSchools.add(new College("Princeton",60000,false));
        privateSchools.add(new College("MIT",65000,false));
        privateSchools.add(new College("LMU",60000,true));
    }
    
    
    public int removeNonBudgetColleges(){
        int x=0;
        for(int i=0; i<publicSchools.length;i++){
            if(publicSchools[i].getTuition()>30000 && publicSchools[i].getScholarship()==false){
                
                publicSchools[i]=null;
                x++;
                
            }

        }
        for(int i=0; i<privateSchools.size();i++){
            if(privateSchools.get(i).getTuition()>30000 && privateSchools.get(i).getScholarship()==false){
                
                privateSchools.remove(i);
                i--;
                x++;
                
            }
            
            
            
        }
        
        return x;
    }
    
    public void makeRoomForAlternates(){
        int n=0;
        for(int i=0; i<publicSchools.length;i++){
            if(publicSchools[i]==null){
                
                n++;
                
                
            }

        }
        College[] newList = new College[this.publicSchools.length];
        for(int i=0; i<publicSchools.length;i++){
            if(publicSchools[i]!=null){
                
                newList[n]=publicSchools[i];
                n++;
            }

        }
        publicSchools=newList;
    }
    
    
    public String toString(){
        
        String n="";
        
        for(College c: publicSchools){
            
            n+=c;
            n+="\n";
            
        }
        n+="________________________\n";
        for(College c: privateSchools){
            
            n+=c;
            n+="\n";
            
        }
        
        return n;
        
    }
    
}
