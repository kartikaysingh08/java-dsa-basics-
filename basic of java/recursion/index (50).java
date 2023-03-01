factors of a number 

import java.io.*; // for handling input/output
import java.util.*;

  class Main {
public static void main(String args[]) {
  // using brute force
  int n = scanner.nextInt();
  for(int i =1; i<=n;i++){
      if (n%i==0){
           
     System.out.print((i));
      }
  }
}
  } 
 // in optimized way   
    Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  for(int i =1; i<=Math.sqrt(n);i++){
      if (n%i==0){
         if (n/i==i){  
               System.out.print((i)) ;
         }
         else{
     System.out.print((i + " " + n/i + " " ));
      }
  }
  }
}
}