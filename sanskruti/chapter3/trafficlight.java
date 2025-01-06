/* 43 */
package chapter3;
import java.util.Scanner;
public class trafficlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTraffic Light System:");
            System.out.println("1. Red");
            System.out.println("2. Yellow");
            System.out.println("3. Green");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Stop! The light is Red.");
                    break;
                case 2:
                    System.out.println("Get ready! The light is Yellow.");
                    break;
                case 3:
                    System.out.println("Go! The light is Green.");
                    break;
                case 4:
                    System.out.println("Exiting ");
                return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
