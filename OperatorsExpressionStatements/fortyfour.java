
/*
 * Implement a program to simulate a countdown timer.
 */

class CountDownTimer {
    private int time;

    public CountDownTimer(int time) {
        this.time = time;
    }

    public void start() {
        while (time > 0) {
            System.out.println(time);
            try {
                Thread.sleep(1000);
                time--;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class fortyfour {
    public static void main(String[] args) {
        CountDownTimer timer = new CountDownTimer(10);
        timer.start();
    }
}
