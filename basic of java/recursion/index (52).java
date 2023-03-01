lcm of 2 no 
import java.io.*; // for handling input/output
import java.util.*;

  class Main {
public static void main(String args[]) {
  // using brute force
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
   int b = scanner.nextInt();
   int k = lcm(a,b);
   System.out.print(k);
   
  }
 public static int gcd (int a , int b) {
     if (a==0){
         return b ;
     }
     return gcd((b%a),a);
 }
  public static int lcm (int a , int b) {
     return(a*b) /gcd (a,b);
}
}