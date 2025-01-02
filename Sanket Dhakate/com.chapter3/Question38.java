/* Generate all perfect numbers up to a given limit. */
public class Question38 {
    public static void main(String[] args) {
        int limit = 1000;

        for (int num = 2; num <= limit; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            }
        }
    }
}
