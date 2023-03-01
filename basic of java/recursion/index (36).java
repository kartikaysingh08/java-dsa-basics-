factorial

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
       int n = scanner.nextInt();
       
       
       Fact(n);
       int z = Fact(n);
       System.out.print(z);
          
    }
    
     public static int Fact(int n){
       if(n==0){
       
       return 1;
          
       }
       int m = Fact(n-1);
       int k=n*m;
       return k;
      
     
       }
    }