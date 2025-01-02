
/* Simulate a traffic light system using switch-case and loops. */
import java.util.Scanner;

public class fortythree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Traffic Light System:");
            System.out.println("1. Red Light");
            System.out.println("2. Yellow Light");
            System.out.println("3. Green Light");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Red Light: STOP!");
                    break;
                case 2:
                    System.out.println("Yellow Light: READY!");
                    break;
                case 3:
                    System.out.println("Green Light: GO!");
                    break;
                case 4:
                    System.out.println("Exiting the Traffic Light System. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            // Adding a small delay to simulate the real-world behavior
            if (isRunning) {
                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
        }

        scanner.close();
    }
}
