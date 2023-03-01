duplicate element in an array

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
         
    for(int i=0;i<n;i++){
       for (int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                System.out.println(a[i]);
            }
        }
     }
     }
    }
    
    
    
         
    
   

