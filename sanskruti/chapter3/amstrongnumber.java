/*37 */
package chapter3;
import java.util.Scanner;
public class amstrongnumber {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
    
            int originalNumber = number, sum = 0, digits = 0;
    
            
            int temp = number;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
    
            
            temp = number;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
    
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
    
            scanner.close();
        }
}
