
/* Calculate the simple interest using float variables. */
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float principal, rate;
        int time;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount:");
            principal = sc.nextFloat();
            System.out.println("Enter the rate of interest:");
            rate = sc.nextFloat();
            System.out.println("Enter the time period in years:");
            time = sc.nextInt();
            float simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest is: " + simpleInterest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
