/* Print the prime numbers in a given range using nested loops. */
public class Question30 {
    public static void main(String[] args) {
        int start = 10, end = 50;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
