/*
 * 4. Simple Calculator
Create a Calculator class with methods for addition, subtraction, multiplication, and division.
 */
class Calculator {
    private int num1;
    private int num2;
    private double result;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        result = num1 + num2;
        return result;
    }

    public double subtract() {
        result = num1 - num2;
        return result;
    }

    public double multiply() {
        result = num1 * num2;
        return result;
    }

    public double divide() {
        if (num2 != 0) {
            result = num1 / num2;
            return result;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

public class forth {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}
