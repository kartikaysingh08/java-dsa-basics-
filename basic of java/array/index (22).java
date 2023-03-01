location/search an element in a matrix  use boolean for t/f
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
    int x = scanner.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(a[i][j] ==x){
        
       System.out.println("   (" + i + ", "+ j+  ")");           
        }
        }
        System.out.println(" ");
    }
    }
    }