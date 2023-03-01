sum and product of a number 

import java.io.*; // for handling input/output
import java.util.*;

   class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
      int n= scanner.nextInt();
     int ans = sumOfDigits(n);
      System.out.print(ans);


}
public static int sumOfDigits(int n){
  if(n==0){
    return 0;
  }
  int rem = n%10;
  return( rem + sumOfDigits(n/10));

}
   }   
    
       Scanner scanner = new Scanner(System.in);
      int n= scanner.nextInt();
     int ans = productOfDigits(n);
      System.out.print(ans);


}
public static int productOfDigits(int n){
  if(n%10==n){
    return n;
  }
  int rem = n%10;
  return( rem * productOfDigits(n/10));

}
   }    