/* Implement a program to simulate a countdown timer*/
package chapter2;

public class countdowntimer {
    public static void main(String[] args) throws InterruptedException {
        int start = 10; 

        while (start >= 0) {
            System.out.println("Time remaining: " + start + " seconds");
            start--; 
            Thread.sleep(1000);
        }

        System.out.println("Countdown complete!");
    }
}
