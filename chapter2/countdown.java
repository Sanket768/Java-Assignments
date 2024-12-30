/* Use a decrement operator to count down from a given number to zero.*/
package chapter2;
import java.util.Scanner;
public class countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count down from: ");
        int num = scanner.nextInt();

        while (num >= 0) {
            System.out.println(num--); 
        }

        scanner.close();
    }
}
