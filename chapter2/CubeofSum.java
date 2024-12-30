/* Write a program to solve the equation: (a + b)^3 */
package chapter2;
import java.util.Scanner;
public class CubeofSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        int result = (int) Math.pow(a + b, 3);
        System.out.println("Result of (a + b)³ is: " + result);

        scanner.close();
    }
}
