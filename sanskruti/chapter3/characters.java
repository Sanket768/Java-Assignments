/* 10 */
package chapter3;
import java.util.Scanner;
public class characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        switch (Character.getType(ch)) {
            case Character.UPPERCASE_LETTER:
                System.out.println(ch + " is an uppercase letter.");
                break;
            case Character.LOWERCASE_LETTER:
                System.out.println(ch + " is a lowercase letter.");
                break;
            default:
                System.out.println(ch + " is neither uppercase nor lowercase.");
        }

        scanner.close();
    }
}
