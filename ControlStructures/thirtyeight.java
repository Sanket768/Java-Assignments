
/* Generate all perfect numbers up to a given limit. */
import java.util.*;

public class thirtyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter the limit:");
            int limit = sc.nextInt();
            List<Integer> perfectNumbers = generatePerfectNumbers(limit);
            System.out.println("Perfect numbers up to " + limit + " are: " + perfectNumbers
                    + "\nNumber of perfect numbers up to " + limit + " is: " + perfect
                    + "\nSum of perfect numbers up to " + limit + " is: " + sum);

        }
    }

    static int perfect = 0;
    static int sum = 0;

    public static List<Integer> generatePerfectNumbers(int limit) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);
                perfect++;
                sum += i;
            }
        }
        return perfectNumbers;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
