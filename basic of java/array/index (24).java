printing diagnols of a matrix 

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
         int m = scanner.nextInt();
   
    int [][] a = new int [n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j]=scanner.nextInt();
        }
    }
    
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if (i==j){
               System.out.print(a[i][j]);
             
           }
       }
    }
     System.out.println("");
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
      if((i+j)==(n-1)){
       System.out.print(a[i][j]);
      }
       }      
       }
  System.out.println("");
       
    
    }
    }