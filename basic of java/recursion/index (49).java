no is prime or not

import java.io.*; // for handling input/output
import java.util.*;


  class Main {
public static void main(String args[]) {
  // through this we are directly checking wheather this no is prime or not
  
 /* Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  boolean k = isPrime(n);
  System.out.print(k);
       
     }*/
     // here we are checking every number upto n 
      Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  for(int i =1; i<=n;i++){
     System.out.print(i+ " " +isPrime(i));
  }
}
     
      public static boolean isPrime(int n ){
         if (n<=1){
            return false ;
         }
         int c = 2;
        // while(c <= Math.sqrt(n) )
         while(c <= Math.sqrt(n) ){
            if(n%c==0){
               return false;
            }
            c++;
         }
         return true;
 }
  }