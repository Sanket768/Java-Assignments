/* 35. Implement a loop that counts up to a given limit but exits early when a specific
condition is met. */
public class thirtyfive {
    public static void main(String[] args) {
        int limit = 10;
        int count = 0;
        while (count < limit) {
            System.out.println("Count: " + count);
            count++;
            if (count == 5) {
                System.out.println("Exiting early due to condition");
                break;
            }
        }

    }
}
