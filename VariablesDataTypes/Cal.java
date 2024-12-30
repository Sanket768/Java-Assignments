/* Perform arithmetic operations (+, -, *, /, %) on two numbers and display the results. */
import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
        int num1, num2;
        String operation;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            num1 = sc.nextInt();
            System.out.println("Enter the second number:");
            num2 = sc.nextInt();
            System.out.println("Enter the operation (+, -, *, /, %):");
            operation = sc.next();
            switch (operation) {
                case "+":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
            }
        }
    }
}
