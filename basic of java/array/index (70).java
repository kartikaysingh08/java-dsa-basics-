//ceiling value in an array
import java.io.*; // for handling input/output
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        
 int []a = {10,20,30,40,50,60}; 
        int k = 59; 
        int ans = binarySearch(a,k);
        System.out.println(ans);
} 
 static int binarySearch(int[]a,int k){
    int first =0;
    int last =a.length-1;
    
    while(first<=last){
        int m = first+(last-first)/2;
         if(k<a[m]){
            last=m-1;
        }
        else if(k>a[m]){
            first=m+1;
        }
        
        else{
            return m;
        }
    }
    return first;
}
}

 
    
 