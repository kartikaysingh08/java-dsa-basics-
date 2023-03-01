max and min
import java.io.*; // for handling input/output
import java.util.*;


class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int max = Integer.MIN_VALUE;
          int min= Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
              if (a[i]>max){
              max =a[i];
              }
              if (a[i]<min){
              min =a[i];
              }
          }
          System.out.println(max);
          System.out.println(min);
          }
    }



   

