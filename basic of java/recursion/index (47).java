no of steps to zeroes; a little improvement is needed in code

import java.io.*; // for handling input/output
import java.util.*;

   class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
      int n= scanner.nextInt();
     
    stepsToZeroes(n,c);
  


}
public static int stepsToZeroes(int n, int count){
  if(n==0){
    return count;
  }
  if (n%2==0){
     return  stepsT0Zeroes(n/2,count+1);
     
}

  return  stepsToZeroes(n-1,count+1);
}
   }   
    

