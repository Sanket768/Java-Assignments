/* Use a ternary operator to find the absolute value 
   of a number. */

import java.util.Scanner;

class Que30{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num = scan.nextInt();
      int absNum = (num >= 0) ? num : -num;
      System.out.println("Absolute value : " + absNum);
   }
}