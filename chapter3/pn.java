/*20 */
package chapter3;
import java.util.Scanner;
public class pn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        int num = 2;
        while (num <= limit) {
            boolean isPrime = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
        scanner.close();
    }
}
