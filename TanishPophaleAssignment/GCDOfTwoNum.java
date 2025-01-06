import java.util.Scanner;

public class GCDOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Ensure numbers are positive
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Find GCD using loops
        int gcd = 1; // Initialize GCD
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update GCD
            }
        }

        // Output the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
