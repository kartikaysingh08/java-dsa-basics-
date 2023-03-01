//kth largest element (sort the array and then print the positn largest element we want to print ex 4th largest) 
//same for kth smallest
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
    //int k =4;
     for(int i=0;i<n-1;i++){
         for(int j=i+1;j<n;j++){
             if( a[i]>a[j]){
             int temp = a[j];
             a[j] = a[i];
              a[i] =temp ;
         }
         }
     }
to decreascomplexity if we there are 1000 element and we need only 4th why need to sort all array find 4th and then break  
         /* if(i==k-1){
          System.out.println(a[i]);
          break;
     }
     }*/
     for(int j=0;j<n;j++){
         System.out.println(a[j]);
     }
    }
    }
     


   

