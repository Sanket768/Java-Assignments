/* Print all prime numbers up to a given number. */
public class Question20 {
    public static void main(String[] args) {
        int limit = 30; 
        for (int num = 2; num <= limit; num++) {
            boolean prime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.println(num);
            }
        }
    }
}