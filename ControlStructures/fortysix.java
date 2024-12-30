
/* Find the factorial of a number using recursion. */
import java.util.*;

public class fortysix {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Factorial of " + n + " is " + factorial(n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
