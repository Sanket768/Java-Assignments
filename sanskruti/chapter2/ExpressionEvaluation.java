/* Write a program to evaluate a mathematical expression: a^2 + 2ab + b^2 */
package chapter2;
import java.util.Scanner;
public class ExpressionEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        int result = a * a + 2 * a * b + b * b;
        System.out.println("Result of a² + 2ab + b² is: " + result);

        scanner.close();
    }
}
