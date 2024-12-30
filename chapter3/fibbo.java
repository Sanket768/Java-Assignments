/* 15 */
package chapter3;
import java.util.Scanner;
public class fibbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
