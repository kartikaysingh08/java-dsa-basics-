reverse a string

import java.io.*; // for handling input/output
import java.util.*;


    class Main {
	public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
     char[]a= str.toCharArray();
      for(int i=a.length-1;i>=0;i--){
         System.out.println(a[i]);
       }     
    }
    
    }
this method will rever the string ex(welcome shubham to shubham welcome)

     Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[]a=str.split(" ");
        for(int i=a.length-1;i>=0;i--){
         System.out.print(a[i]);
        }
        }
        }