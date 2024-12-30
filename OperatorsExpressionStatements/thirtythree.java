/* 33. Compute the compound interest for a given principal, rate, and time using
expressions. */
import java.util.Scanner;
class CompoundInterest {
    private double principal;
    private double rate;
    private int time;

    public CompoundInterest(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double computeInterest() {
        double interest = principal * Math.pow(1 + (rate*0.01), time);
        return interest;
    }
}

public class thirtythree {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the principal amount:");
            double principal = sc.nextDouble();
            System.out.println("Enter the rate of interest:");
            double rate = sc.nextDouble();
            System.out.println("Enter the time in years:");
            int time = sc.nextInt();
            CompoundInterest ci = new CompoundInterest(principal, rate, time);
            double interest = ci.computeInterest();
            System.out.println("The compound interest is: " + interest);
        }
    }
}
