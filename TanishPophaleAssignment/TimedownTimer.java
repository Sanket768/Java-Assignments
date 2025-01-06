import java.util.concurrent.TimeUnit;

public class TimedownTimer {

    public static void main(String[] args) {
        
        int seconds = 10; // Countdown duration in seconds

        try {
            for (int i = seconds; i > 0; i--) {
                System.out.println("Time remaining: " + i + " seconds");
                TimeUnit.SECONDS.sleep(1); // Pause for 1 second
            }
            System.out.println("Time's up!");
        } catch (InterruptedException e) {
            System.err.println("Timer interrupted!");
        }
    }
}