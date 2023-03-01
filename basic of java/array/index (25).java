sum of the diagnols

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
    int sumL=0;
    int SumR=0;
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if (i==j){
             sumL+=a[i][j];
           }
           if((i+j)==(n-1)){
       SumR+=a[i][j];
      } 
       }
    }
  System.out.print(sumL);
    System.out.print(SumR);   
    
    }
    }