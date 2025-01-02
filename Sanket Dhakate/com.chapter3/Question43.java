/* Simulate a traffic light system using switch-case and loops. */
import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lights = {"Red", "Yellow", "Green"};
        int currentLight = 0;

        while (true) {
            System.out.println("Traffic Light: " + lights[currentLight]);
            System.out.println("1. Next light");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                currentLight = (currentLight + 1) % 3;
            } else {
                break;
            }
        }
    }
}
