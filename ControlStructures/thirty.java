
/* Print the prime numbers in a given range using nested loops. */
import java.util.*;

public class thirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter the lower limit of the range:");
            int lower = sc.nextInt();
            System.out.println("Enter the upper limit of the range:");
            int upper = sc.nextInt();
            for (int i = lower; i <= upper; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
        finally{
            sc.close();
        }
    }
}
