inversion count (count pairs in which left side digit is greater than right side digit)

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       // int max = 15;
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
          for(int i=0;i<n;i++){
              System.out.println(a[i]);
          }
         int count = 0;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if (a[i]>a[j]){
                count++ ;
                
            }
        }
    }
      System.out.println(count);      
        
     }
    }
    
    
    
         
    
   

