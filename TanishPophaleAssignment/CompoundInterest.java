// Program to calculate the compound interest based on the required parameters
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input annual interest rate (in percentage)
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        // Input time period (in years)
        System.out.print("Enter the time period (in years): ");
        int time = scanner.nextInt();

        // Input number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / 100) / n, n * time);
        double compoundInterest = amount - principal;

        // Output the result
        System.out.printf("The compound interest is: %.2f%n", compoundInterest);
        System.out.printf("The total amount is: %.2f%n", amount);

        scanner.close();
    }
}

