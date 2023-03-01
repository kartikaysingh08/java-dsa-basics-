cyclically rotate the array  by one 

import java.io.*; // for handling input/output
import java.util.*;

/
    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
          for(int i=0;i<n;i++){
              System.out.println(a[i]);
          }
          int temp = a[n-1];
         for(int i =n-1;i>0;i--){
             a[i]=a[i-1];
         }
             a[0]=temp;
         
                 for (int i =0; i <n; i++){
      System.out.print(a[i] + " ");
                 }
    }
    }
 for two use two temp variables 

    
    
    
         
    
   

