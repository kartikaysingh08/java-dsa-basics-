tower of hanoi

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
       int n = scanner.nextInt();
     
     
         towerOfHanoi(n,"s","h","d");
        
    }
    
     public static void towerOfHanoi( int n ,String s, String h,String d){
         if (n==1){
             System.out.println("transfer disk" + n +" from "+s+" to "+d);
             return;
         }
         towerOfHanoi( n-1,s,d,h);
         System.out.println("transfer disk" + n + " from " + s + " to " + d );
         towerOfHanoi( n-1 , h, s,d); 
     
       }
    }