/* Calculate the sum of all even and odd numbers 
   up to n using conditional and arithmetic operators. */
import java.util.Scanner;
class Que48{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the n: ");
      int n = scanner.nextInt();

      int evenSum = 0;
      int oddSum = 0;

      for (int i = 1; i <= n; i++){
         if(i % 2 == 0){
            evenSum = evenSum + i;
         }
         else{
            oddSum = oddSum + i;
         }
      }

      System.out.println("Even Sum: " + evenSum);
      System.out.println("Odd Sum: " + oddSum);

   }
}