/* Write a program to evaluate a mathematical expression: 
   a^2 + 2ab + b^2. */
import java.util.Scanner;
class Que32{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the value of a:");
      double a = s.nextDouble();
      System.out.println("Enter the value of b:");
      double b = s.nextDouble();
      double result = a*a + 2*a*b + b*b;
      System.out.println("The value of a^2 + 2ab + b^2 : " + result);
   }
}

