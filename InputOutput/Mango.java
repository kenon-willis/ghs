public class Mango
{
    public static void main(){
        int total = 0;
        int currTotal;
        for(int i=1; i<1000;i++){
            
            int a = i%10;
            int num = i/10;
            int b = num%10;
            int num1 = i/100;
            int c=num1%10;
            
            if(a==1 || a==2 || a==6){
                total+=3;
            }
            else if(a==4 || a==5 || a==9){
                total+=4;
            }
            else if(a==3 || a==7 || a==8){
                total+=5;
            }
            
            if(b==1){
                if(a==0)
                    total+=3;
                else if(a==1){
                    total+=6;
                    total-=3;
                }
                else if(a==2){
                    total+=6;
                    total-=3;
                }
                else if(a==3){
                    total+=8;
                    total-=5;
                }
                else if(a==4){
                    total+=8;
                    total-=4;
                }
                else if(a==5){
                    total+=7;
                    total-=4;
                }
                else if(a==6){
                    total+=7;
                    total-=3;
                }
                else if(a==7){
                    total+=9;
                    total-=5;
                }
                else if(a==8){
                    total+=8;
                    total-=5;
                }
                else if(a==9){
                    total+=8;
                    total-=4;
                    
                }
                
                
                
                
                
            }
            
            else if(b==4 || b==5 || b==6){
                total+=5;
            }
            else if(b==2 || b==3 || b==9 || b==8){
                total+=6;
            }
            else if(b==7 ){
                total+=7;
            }
            
            
            
            
            
            if(c==1 || c==2 || c==6){
                total+=13;
            }
            if(c==4 || c==5 || c==9){
                total+=14;
            }
            if(c==3 || c==7 || c==8){
                total+=15;
            }
            
            System.out.println(c+" " + b + " " + a + " " + total);
        }
        
        total+=11;
        total-=27;
        
        System.out.println(total);
        
        
    }
}
//21124