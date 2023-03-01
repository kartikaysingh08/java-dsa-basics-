max contiguos sum subarray brute force method ;

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
          int max = 15;
         // int sum =0;
          for(int i=0;i<n;i++){
              int sum =0;
              for(int j=0;j<n;j++){
                   
                   sum = sum + a[j];
               
                 if (sum>max){
                     //max=sum;
                     System.out.println(sum);
                   // break;
                 } 
              }
          }
    }
    }
     
 
    
    
    
         
    
   

