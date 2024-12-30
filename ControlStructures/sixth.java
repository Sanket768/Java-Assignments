
/* Create a simple calculator using a switch-case statement. */
import java.util.*;

class Calculator {
    private int num1, num2;
    private char operation;
    private double result;

    public Calculator(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return 0;
        }
        return result;
    }
}

public class sixth {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number:");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation (+, -, *, /):");
            char operation = sc.next().charAt(0);
            Calculator calculator = new Calculator(num1, num2, operation);
            System.out.println("Result: " + calculator.calculate());
        }
    }
}