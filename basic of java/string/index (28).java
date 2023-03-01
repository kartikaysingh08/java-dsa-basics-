string is palindrome or not

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();       
        String rev =" " ;
    // char[]a= str.toCharArray();
      for(int i=str.length()-1 ;i>=0;i--){
        rev = rev+str.charAt(i);
      }
      
      if(str.equals(rev))
     {
         System.out.println("palindrome string");
      }
      else{
        System.out.println("not palindrome");
      }
   }
    }
    