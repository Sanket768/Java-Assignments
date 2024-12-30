
/* Check if a number is an Armstrong number (e.g., 153 = 1³ + 5³ + 3³). */
import java.util.*;

public class thirtyseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int num = n;
            int sum = 0;
            int count = 0;
            int rem;
            while (num != 0) {
                rem = num % 10;
                num = num / 10;
                count++;
            }
            num = n;
            while (num != 0) {
                rem = num % 10;
                sum = sum + (int) Math.pow(rem, count);
                num = num / 10;
            }
            if (sum == n) {
                System.out.println(n + " is an Armstrong number.");
            } else {
                System.out.println(n + " is not an Armstrong number.");
            }
        }
    }
}
