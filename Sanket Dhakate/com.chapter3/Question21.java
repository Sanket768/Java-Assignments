/* Write a program to display a menu and repeat the action until the user selects "exit." */
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Dal");
            System.out.println("2. Rice");
            System.out.println("3. Roti");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nDal selected.\n");
                    break;
                case 2:
                    System.out.println("\nRice selected.\n");
                    break;
                case 3:
                    System.out.println("\nRoti selected\n");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
