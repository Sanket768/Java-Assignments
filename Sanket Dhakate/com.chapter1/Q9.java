/* Perform arithmetic operations (+, -, *, /, %) on two numbers 
   and display the results. */

public class Q9 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int sum = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Substraction: " + minus);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
        System.out.println("Modulus: " + modulus);

    }
    
}
