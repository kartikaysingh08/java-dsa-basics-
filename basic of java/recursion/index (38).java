
 power function x^n 

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
       int n = scanner.nextInt();
       int x =scanner.nextInt();
       
     
         printPower( x, n);
         int z = printPower(x,n);
         System.out.print(z);
    }
    
     public static int printPower( int x ,int n){
      if(n==0){
          return 1;
      }
      if(x==0){
          return 0;
      } 
    int m = printPower(x,n-1);
    int k= x*m ;
    return k;
    
       }
    }