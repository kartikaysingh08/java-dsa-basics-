cyclically rotate by 90 degree 

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
         int m = scanner.nextInt();
   
    int [][] a = new int [n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=scanner.nextInt();
        }
    }
    
    for(int i=n-1;i>=0;i--){
       for(int j=0;j<m;j++){
       System.out.print(a[i][j]); 
       }
    System.out.println("");
       
    }
    }
    }