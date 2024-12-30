/* 49 */
package chapter3;
import java.util.Scanner;
public class string {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str; 
        }
        return reverse(str.substring(1)) + str.charAt(0); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed string: " + reverse(input));
        scanner.close();
    }
}
