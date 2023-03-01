//union of two arrays or merging of two
import java.io.*; // for handling input/output
import java.util.*;

    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int m = scanner.nextInt();
     int[]a = new int[n];
        int[]b = new int[m];
    int []c= new int [m+n];
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
         
         c[i]=a[i];
         
    }
  
    
    for (int i=0;i<m;i++){
         
         c[n+i]=b[i];
    }
    for (int i=0;i<m+n;i++){
    System.out.println(c[i]);
    }
    }
    }
    
         
    
   

