PRINTING NUMBERS USING RECURSION

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       printNum(n);
       
    }
    
     public static void printNum(int n){
       if(n==0){
       return;
       }
       System.out.print(n);
       printNum(n-1);
       }
    } 