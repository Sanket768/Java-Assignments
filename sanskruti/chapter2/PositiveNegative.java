/*  Check if a number is positive, negative, or zero using a ternary operator */
package chapter2;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number > 0) ? "Positive" : (number < 0 ? "Negative" : "Zero");

        System.out.println("The number is: " + result);
    }
}
