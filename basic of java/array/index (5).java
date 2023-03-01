intersection of two arrays

import java.io.*; // for handling input/output
import java.util.*;

/

    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int m = scanner.nextInt();
     int[]a = new int[n];
        int[]b = new int[m];
    //int []c= new int [];
     for(int i=0;i<n;i++){
     a[i]=scanner.nextInt();
     }
       for(int i=0;i<n;i++){
         System.out.println(a[i]);
     }
     for(int i=0;i<m;i++){
     b[i]=scanner.nextInt();
     }
       for(int i=0;i<m;i++){
         System.out.println(b[i]);
     }
     for (int i=0;i<n;i++){
         for( int j=0;j<m;j++){
             if (a[i]==b[j]){
             System.out.println(a[i]);
         }
     }      
    }
    //for (int i=0;i<a.length;i++){
      // System.out.println(a[i]);
    }
    }
    
    
         
    
   

