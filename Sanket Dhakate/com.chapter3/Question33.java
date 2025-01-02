/* Create a program that stops processing numbers when a negative number is encountered. */
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Negative number encountered. Stopping...");
                break; 
            }

            System.out.println("You entered: " + number);
        } while (number >= 0);
    }
}
