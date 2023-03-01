
STRING IS ROTATION OF ANOTHER STRING
import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        String S1 = scanner.nextLine();       
        String S2 = scanner.nextLine();
     //char[]a= str.toCharArray();
   if(S1.length()!=S2.length()){
      System.out.println("not a rotation");
    }
    String S3 = S1+S2; 
    
      if(S3.indexOf(S2) != -1){
        System.out.println("is a rotation"); 
      }
      else{
         System.out.println("is not a rotation"); 
      }
   }
    }
    