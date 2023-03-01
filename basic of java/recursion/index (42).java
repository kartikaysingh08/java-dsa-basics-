checking if array is sorted

import java.io.*; // for handling input/output
import java.util.*;

    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
    
     int[]a= {1,3,5};
  
   boolean i =  isSorted(a, 0 );
       System.out.print(i); 
    }
  
     public static boolean isSorted(int a[]   ,int k ){
         if (k==(a.length-1)){
         return true;
         }
         if (a[k]<a[k+1]){
             
           return isSorted(a,k+1);// to check othere values if we only return true program will end there
         }
         
         else{
             return false ;
         }
         
     }
    }