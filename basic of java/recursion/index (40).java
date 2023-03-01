reverse a string
import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
     String s = scanner.nextLine();
   
     
         reverseString(s,s.length()-1);
        
    }
    
     public static void reverseString( String s, int idx){
         if (idx==0){
           System.out.print(s.charAt(idx));  
             return;
         }
       System.out.print(s.charAt(idx));
      reverseString(s,idx-1) ;    
       }
    }
   // can also use char[]a=