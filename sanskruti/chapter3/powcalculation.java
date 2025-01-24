/*23 */
package chapter3;
import java.util.Scanner;
public class powcalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        int count = 0;

        do {
            result *= base;
            count++;
        } while (count < exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        scanner.close();
    }
}
