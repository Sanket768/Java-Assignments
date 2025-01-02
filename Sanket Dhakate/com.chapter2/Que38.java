/* Implement a simple calculator using a switch statement. */
import java.util.Scanner;
class Que38{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num1 and num2 : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter the operator (+, -, *, /): ");
        char op = scan.next();
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
            }
        System.out.println("Result: " + result);
    }
}