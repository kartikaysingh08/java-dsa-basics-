// reverse an array
import java.io.*; // for handling input/output
import java.util.*;

class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a[]=new int [n];
       for (int i=0;i<n;i++){
           a[i]=scanner.nextInt();    
            }
            for(int i=0;i<n;i++){
               System.out.println(a[i]);
            }
            for(int i=n-1;i>=0;i--){
                System.out.println(a[i]);
            } 
        }
}


   

