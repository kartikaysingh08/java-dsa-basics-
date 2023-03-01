common elements of 3 sorted array

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int m = scanner.nextInt();
       int o = scanner.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        int []c = new int[o];
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
        
        
           for(int k=0;k<o;k++){
            c[k]=scanner.nextInt();
            }
        
          for(int k=0;k<o;k++){
              System.out.println(c[k]);
          }
        
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            for(int k=0;k<o;k++){
                if((a[i]==b[j]) &&(b[j]==c[k])){
                
               System.out.println(a[i]); 
            }
        }
    }
    
    }   
        
     }
    }
    
    
    
         
    
   

