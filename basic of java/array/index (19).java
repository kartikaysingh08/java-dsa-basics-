median of two arrays of same size + this can be used for different sizes  as well 
 
import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
         int m = scanner.nextInt();
      
    int []a = new int[n];
       int []b = new int[m]; 
        int []c = new int[m+n]; 
        //int []d = new int[m+n];
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
        
         
        for(int i =0; i<n;i++){  
               c[i]=a[i];
               }
             for(int i =0; i<m;i++){  
               c[a.length+i]=b[i];
               
            }
            //can use  algo or iterate through array using i&j i=0 & j=1 and put condition
            Arrays.sort(c);
              for(int i =0; i<c.length;i++){ 
                  System.out.print(c[i]);
              }  
                  System.out.println(" ");
                    
              // for odd
                   if(((c.length+1)%2)==0){
               System.out.println (c[(c.length/2)]);     
        }   
        //for even          
        if(((c.length)%2)==0){
           System.out.println (c[((c.length/2)+(c.length/2)+1)/2]);
        }  
    }
    }
    // use double for decimal value ;
    
    
         
    
   