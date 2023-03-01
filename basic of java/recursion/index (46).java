no of zeroes

import java.io.*; // for handling input/output
import java.util.*;

   class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
      int n= scanner.nextInt();
     
      no0fZeroes(n,0);
      System.out.print(count);


}
public static int noOfZeroes(int n, int count){
  if(n==0){
    return count;
  }
  if (n%10==0){
     return noOfZeroes(n/10,count++);
     
}
  return noOfZeroes(n/10,count);


}
   }   
    

