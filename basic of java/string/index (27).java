
duplicate character in an array
import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
     char[]a= str.toCharArray();
      for(int i=0;i<a.length-1;i++){
         for(int j =i+1;j<a.length;j++){
        
         if(a[i]==a[j]){
         System.out.print(a[i]);
         System.out.print("");    
       } 
        System.out.print("");
         }    
    }
   }
    }
    