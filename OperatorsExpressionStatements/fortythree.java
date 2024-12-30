
/* Use a decrement operator to count down from a given number to zero. */
import java.util.Scanner;

class CountDown {
    private int num;

    public CountDown(int num) {
        this.num = num;
    }

    public void countDown() {
        while (num > 0) {
            System.out.println(num);
            num--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class fortythree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            CountDown countDown = new CountDown(num);
            countDown.countDown();
        }
    }
}
