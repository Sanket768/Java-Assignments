/* 44 */
package chapter3;
import java.util.Scanner;
public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nUnit Conversion Menu:");
            System.out.println("1. Temperature (Celsius to Fahrenheit)");
            System.out.println("2. Distance (Kilometers to Miles)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    int celsius = scanner.nextInt();
                    int fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Enter distance in Kilometers: ");
                    int kilometers = scanner.nextInt();
                    int miles = kilometers * 621371;
                    System.out.println("Distance in Miles: " + miles);
                    break;
                case 3:
                    System.out.println("Exiting Unit Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
