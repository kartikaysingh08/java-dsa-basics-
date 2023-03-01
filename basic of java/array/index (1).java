//sorting array without algo
import java.io.*; // for handling input/output
import java.util.*;

    class Main {
	public static void main(String args[]) {
     Scanner scanner = new Scanner (System.in);
     int n = scanner.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=scanner.nextInt();
     }
     for(int i=0;i<n;i++){
         System.out.println(a[i]);
     }
     //int min =a[i];
     for(int i=0;i<n-1;i++){
         for(int j=i+1;j<n;j++){
             if( a[i]>a[j]){
             int temp = a[j];
             a[j] = a[i];
              a[i] =temp ;
         }
         }
     }
     for(int j=0;j<n;j++){
         System.out.println(a[j]);
     }
    }
    }
     


   

