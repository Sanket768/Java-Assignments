/* Create a simple calculator using a switch-case statement. */
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        int num1 = 57;
        int num2 = 20;
        Scanner scan = new Scanner(System.in);
        char operator = scan.next().charAt(0);
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition : " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction : " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication : " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                System.out.println("Division : " + result);
                break;
            default:
                System.out.println("Error: Invalid operator.");
            }
    }
}
