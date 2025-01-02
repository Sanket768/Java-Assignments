/* Write a program to generate the first n terms of  
   the Fibonacci series using increment operators. */
import java.util.Scanner;
class Que42{
   public static void main(String[] args) {
      int t1 = 0;
      int t2 = 1;
      int t3;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the first n terms of the Fibonacci series");
      int n = s.nextInt();


      if (n <= 0) {
         System.out.println("Enter valid number");
      }
      else if (n ==1){
         System.out.print(t1);
      }else{
         System.out.print(t1 + " " + t2);
      }
      
      for (int i = 3; i <= n; i++){
         t3 = t1 +  t2;
         t1 = t2 ;
         t2 = t3;
         System.err.print(" " + t3);
      } 
      System.err.println("");
   }
}