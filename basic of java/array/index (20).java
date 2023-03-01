spiral traversal of a matrix

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
         int m = scanner.nextInt();
      
    int[][] a = new int[n][m];
      
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        a[i][j]=scanner.nextInt();
    }
    }
     int r =0;
     int re =n-1;
     int c =0;
     int ce=m-1;
     
     while(r<=re && c<=ce){
         for(int i =c;i<=ce;i++){
             System.out.print(a[r][i]);
             System.out.print("");
         }
        r++;
        for(int j=r;j<=re;j++){
            System.out.print(a[j][ce]);
           System.out.print("");
     }
     ce--;
     for(int i=ce;i>=c;i--){
          System.out.print(a[re][i]);
           System.out.print("");
    }
    re--;
    for(int j =re;j>=r;j--){
         System.out.print(a[j][c]);
           System.out.print("");
    }
    c++;
    }
    }
    }