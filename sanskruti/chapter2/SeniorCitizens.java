/*  Determine if a person is eligible for senior citizen benefits based on age using the
ternary operator  */
package chapter2;
import java.util.Scanner;

public class SeniorCitizens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String eligibility = (age >= 60) ? "Eligible for senior citizen benefits" : "Not eligible for senior citizen benefits";

        System.out.println("Eligibility: " + eligibility);
    }
}
