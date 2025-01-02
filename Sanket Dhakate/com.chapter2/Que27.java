/* Check if a number is positive, negative, or zero 
   using a ternary operator. */
import java.util.Scanner;
class Que27{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int number = scanner.nextInt();
      String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "zero";

      System.out.println(result);
   }
}