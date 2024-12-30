/*Write a program to check if a number is a multiple of 2, 3, or 5. */
package chapter2;
import java.util.Scanner;
public class multiplecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + " is a multiple of 2, 3, or 5.");
        } else {
            System.out.println(num + " is not a multiple of 2, 3, or 5.");
        }

        scanner.close();
    }
}
