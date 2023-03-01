first and last occurance of an element

import java.io.*; // for handling input/output
import java.util.*;
 
      


    class Main {
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
     String s = scanner.nextLine();
   
     
        findOccurance (s,0,'k');
        
    }
    public static int  first=(-1);
    public static int last=(-1);
     public static void findOccurance ( String s, int idx ,char element){
         if (idx==s.length()){
         System.out.println(first);
         System.out.println(last);
         return;
         }
         
        int x =s.charAt(idx);
        if(x==element){
            if(first==-1){
                first=x;
            }
        }
        else{
            last=x ;
        }
        findOccurance(  s, idx+1 , element);
     }
    }