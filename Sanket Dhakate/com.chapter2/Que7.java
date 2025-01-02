/* Check if a given number lies within 
   a specific range (e.g., 10 to 50). */
import java.util.Scanner;

public class Que7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 10 && num <= 50) {
            System.out.println(num + " is within the range of 10 to 50.");
        } else {
            System.out.println(num + " is not within the range of 10 to 50.");
        }
    }
}