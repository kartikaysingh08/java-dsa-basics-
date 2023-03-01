
an array subset of another array (use boolean for true and false)
import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
         int m = scanner.nextInt();
     
    int []a = new int[n];
        int []b =new int[m];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
         for(int i=0;i<n;i++){
              System.out.println(a[i]);
         }
          for(int j=0;j<m;j++){
            b[j]=scanner.nextInt();
 }
     for(int j=0;j<m;j++){
              System.out.println(b[j]);
     }
       
        for(int i =0 ; i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
            
                }
            }
        }  
  
   
    }
    }
    
    
         
    
   

