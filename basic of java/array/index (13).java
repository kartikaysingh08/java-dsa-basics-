factorial of a number for larger number use long

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        
     
         
        int fact = 1;
         for(int i=1;i<n;i++){
             fact = fact*i;
         }
         System.out.println(fact);
              
        
     }
    }
    
    
    
         
    
   

