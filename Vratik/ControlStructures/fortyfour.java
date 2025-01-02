
/* 44. Display a menu for converting between units (e.g., temperature, distance) and perform
the selected operation. */
import java.util.*;

public class fortyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Distance Conversion");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.print("Enter your choice: ");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1 -> {
                            System.out.print("Enter temperature in Celsius: ");
                            double celsius = sc.nextDouble();
                            double fahrenheit = (celsius * 9 / 5) + 32;
                            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
                        }
                        case 2 -> {
                            System.out.print("Enter temperature in Fahrenheit: ");
                            double fahrenheit1 = sc.nextDouble();
                            double celsius1 = (fahrenheit1 - 32) * 5 / 9;
                            System.out.println(fahrenheit1 + "°F is equal to " + celsius1 +
                                    "°C");
                        }
                        default -> System.out.println("Invalid choice");
                    }
                }
                case 2 -> {
                    System.out.println("1. Kilometers to Miles");
                    System.out.println("2. Miles to Kilometers");
                    System.out.print("Enter your choice: ");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1 -> {
                            System.out.print("Enter distance in Kilometers: ");
                            double kilometers = sc.nextDouble();
                            double miles = kilometers * 0.621371;
                            System.out.println(kilometers + " km is equal to " + miles + " miles");
                        }
                        case 2 -> {
                            System.out.print("Enter distance in Miles: ");
                            double miles1 = sc.nextDouble();
                            double kilometers1 = miles1 * 1.60934;
                            System.out.println(miles1 + " miles is equal to " + kilometers1 + " km ");
                        }
                        default -> System.out.println("Invalid choice");
                    }
                }
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
