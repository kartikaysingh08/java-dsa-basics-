triplets with sum greater than a given sum
import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
         
     
    int []a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
         for(int i=0;i<n;i++){
              System.out.println(a[i]);
         }
    
      
       int count =0;
       int sum=15;
        for(int i =0; i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){ 
                if(a[i]+a[j]+a[k] > sum){
                    count++;
            
                }
            }
        }  
        }
        System.out.println(count);
   
    }
    }
    
    
         
    
   

