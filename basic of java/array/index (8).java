max sum subarray using kadane algo ;

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
         
    int max =0;
    int curr_max = 0;
     for(int i=0;i<n;i++){
         curr_max=curr_max + a[i];
             if (max<curr_max){
                 max = curr_max;
             }
             if(curr_max<0){
                 curr_max=0;
             }
     }
     System.out.println(max);
     }
     }
 
    
    
    
         
    
   

