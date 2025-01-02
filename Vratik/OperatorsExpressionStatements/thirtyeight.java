
/* Implement a simple calculator using a switch statement. */
import java.util.Scanner;

class Calc {
    private double num1, num2;
    private char operation;
    private Scanner scanner;

    public Calc() {
        scanner = new Scanner(System.in);
    }

    public void getNums() {
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();
    }

    public void getOperation() {
        System.out.println("Enter operation (+, -, *, /):");
        operation = scanner.next().charAt(0);
    }

    public double calculate() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0)
                    return num1 / num2;
                else
                    return Double.POSITIVE_INFINITY;
            default:
                return Double.NaN;
        }
    }
}

public class thirtyeight {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.getNums();
        calc.getOperation();
        System.out.println("Result: " + calc.calculate());
    }
}
