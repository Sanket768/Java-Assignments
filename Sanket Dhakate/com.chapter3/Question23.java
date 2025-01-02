/* Calculate the power of a number using a do-while loop. */
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        int count = 1;

        do {
            result *= base;
            count++;
        } while (count <= exponent);

        System.out.println("result: " + result);
    }
}
