movingb a character at the end of the string

import java.io.*; // for handling input/output
import java.util.*;

    class Main {
	public static void main(String args[]) {
  
   Scanner scanner = new Scanner(System.in);
     String s = scanner.nextLine();
     String x ="";
     
       moveCharacter( s, 0,0, x) ;
    }
  
     public static void  moveCharacter(String s, int k,int count, String x){
         if (k==s.length()){
             for(int i=0;i<count;i++){
                 x=x+'e';
             }
             System.out.print(x);
             return;
         }
         char z = s.charAt(k);
         if(z=='e'){      one can take any character 
             count++;
             moveCharacter( s,k+1,count, x);
         }
         else{
             x=x+z;
             moveCharacter(s,k+1,count, x);
     }
     }
    }