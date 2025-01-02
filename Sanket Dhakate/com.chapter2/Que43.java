/* Use a decrement operator to count down from a given number 
   to zero. */
import java.util.Scanner;
class Que43{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int num = scanner.nextInt();
      for(int i = num; i >= 0; i--) {
         System.out.println(i);
      }
   }
}