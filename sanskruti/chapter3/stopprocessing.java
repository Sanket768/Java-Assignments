/*33*/
package chapter3;
import java.util.Scanner;
public class stopprocessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (negative number to stop):");
        
        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Negative number encountered. Stopping.");
                break;
            }
            System.out.println("You entered: " + num);
        }
        
        scanner.close();
    }
}
