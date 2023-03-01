import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();       
       
     char[]a= s1.toCharArray();
 for(int i=0;i<s1.length();i++){
   for(int j=0;j<s1.length();j++){
     for(int k=0;k<=j;k++){
       System.out.print(a[k]);
     }
      System.out.println(" ");
   }
 }
   }
    }
    