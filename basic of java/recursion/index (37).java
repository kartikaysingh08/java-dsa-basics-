Fibonacci series

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
       int n = scanner.nextInt();
       int a =0;
       int b=1;
    System.out.print(a);
         System.out.print(b); 
         printFibonacci( a, b,  n-2);
    }
    
     public static void printFibonacci(int a, int b ,int n){
       if(n==0){
       return;
     }
       int c=a+b;
     System.out.print(c);
     printFibonacci(b,c,n-1);
    
       }
    }