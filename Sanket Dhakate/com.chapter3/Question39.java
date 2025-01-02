/* Print the first n terms of an arithmetic progression and a geometric progression. */
import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.print("Enter the first term: ");
        int firstTerm = scanner.nextInt();
        System.out.print("Enter the common difference (for arithmetic progression): ");
        int d = scanner.nextInt();
        System.out.print("Enter the common ratio (for geometric progression): ");
        int r = scanner.nextInt();

        System.out.println("Arithmetic Progression:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            firstTerm += d;
        }

        System.out.println("\nGeometric Progression:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            firstTerm *= r;
        }
    }
}
