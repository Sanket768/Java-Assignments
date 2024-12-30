
/* Find the GCD of two numbers using recursion. */
import java.util.*;

public class fortyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println("The GCD of " + a + " and " + b + " is " + findGCD(a, b));
        } finally {
            sc.close();
        }
    }

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGCD(b, a % b);
    }
}
