/* 33. Compute the compound interest for a given principal, rate, and time using
expressions */
package chapter2;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter rate of interest: ");
        int rate = scanner.nextInt();
        System.out.print("Enter time (in years): ");
        int time = scanner.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest is: " + compoundInterest);

        scanner.close();
    }
}
