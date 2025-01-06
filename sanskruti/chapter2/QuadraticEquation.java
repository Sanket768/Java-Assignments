/* Calculate the roots of a quadratic equation using an expression */
package chapter2;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
             double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double  root = -b / (2 * a);
            System.out.println("Root is: " + root);
        } else {
            System.out.println("No real roots exist.");
        }
        scanner.close();
    }
}
