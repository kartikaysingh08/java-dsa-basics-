gcd of two numbers using recursion

import java.io.*; // for handling input/output
import java.util.*;

  class Main {
public static void main(String args[]) {
  // using brute force
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
   int b = scanner.nextInt();
   int k = gcd(a,b);
   System.out.print(k);
   
  }
 public static int gcd (int a , int b) {
     if (a==0){
         return b ;
     }
     return gcd((b%a) , a);// (rem(b,a),a)
}
}