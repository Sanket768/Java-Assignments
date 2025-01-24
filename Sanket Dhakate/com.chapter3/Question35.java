/* Implement a loop that counts up to a given limit but exits early when a specific condition is met. */
public class Question35 {
    public static void main(String[] args) {
        int limit = 20;
        int exitCondition = 15;

        for (int i = 1; i <= limit; i++) {
            if (i == exitCondition) {
                System.out.println("Condition met, exiting early.");
                break; 
            }
            System.out.println(i);
        }
    }
}
