
factorial of a number using recursion
 import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
       int n = scanner.nextInt();
       
       
       Fact(n);
       int m = Fact(n);
       System.out.print(m);
          
    }
    
     public static int Fact(int n){
       if(n==0){
       
       return 1;
          
       }
       
       return n*Fact(n-1);
     
       }
    }