public class HiddenWord

   {

   private String word;

   

   public HiddenWord( String initialWord )

      {

      word = new String( initialWord );    

      } // end one-arg constructor

       

      

   public String getHint( String guess )  

      {
          String newWord="";
          
          if(guess.equals(this.word)){
              return this.word;
            }
          else{
              for(int i = 0; i<guess.length(); i++){
                  
                  if(this.word.substring(i,i+1).equals(guess.substring(i,i+1))){
                      newWord+=guess.substring(i,i+1);
                  }
                  else if(this.word.contains(guess.substring(i,i+1)))
                  {
                      newWord+="+";
                  }
                  else{
                      newWord+="*";
                  }
                    
                  
                  
                }
              
              
            }
      

            return newWord;    

      } // end method getHint

      

   public String toString()

      {

      return word;   

      } // end method toString

   } // end class HiddenWord