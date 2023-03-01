printing num in increasing orders

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       printNum(n);
       
    }
    
     public static void printNum(int n){
       if(n==7){
       return;
       }
       System.out.print(n);
       printNum(n+1);
       }
    } 