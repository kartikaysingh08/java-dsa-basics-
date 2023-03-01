sum of n natural numbers recursion

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
       int i = scanner.nextInt();
       int n = scanner.nextInt();
       int sum = scanner.nextInt();
       
       printSum(i,n,sum);
           // System.out.println(sum);
    }
    
     public static void printSum(int i,int n,int sum){
       if(i==n){
           sum=sum+i;
        System.out.println(sum);
       return ;
          
       }
       
    sum=sum+i;
     
    printSum(i+1,n,sum);
       
       }
    } 