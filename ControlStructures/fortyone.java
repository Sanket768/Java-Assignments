
/* Write a program to categorize a number as odd/even and prime/composite. */
import java.util.*;

public class fortyone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " is even.");
            } else {
                System.out.println(n + " is odd.");
            }
            if (n > 1) {
                for (int i = 2; i < n;) {
                    if (n % i == 0) {
                        System.out.println(n + " is composite.");
                        break;
                    } else {
                        System.out.println(n + " is prime.");
                        break;
                    }
                }
            } else {
                System.out.println(n + " is neither prime nor composite.");
            }
        }
    }
}
