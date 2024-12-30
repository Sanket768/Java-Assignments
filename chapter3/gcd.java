/*48 */
package chapter3;
import java.util.Scanner;
public class gcd {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        scanner.close();
    }
}
