/* Use a ternary operator to find the absolute value of a number  */
package chapter2;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int absoluteValue = (number < 0) ? -number : number;

        System.out.println("The absolute value is: " + absoluteValue);
    }
}
