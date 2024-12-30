
/* Calculate the nth Fibonacci number using recursion. */
import java.util.*;

public class fortyseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("The " + n + "th Fibonacci number is " + fibonacci(n));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
