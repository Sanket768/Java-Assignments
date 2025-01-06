// Simple Interest Calculation


import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args){
        double principleAmount, SimpleInterest, rate;
        int time;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount: ");
        principleAmount = sc.nextDouble();

        System.out.println("Enter the rate of interest; ");
        rate = sc.nextDouble();

        System.out.println("Enter the time for which you have to keep the PrincipalAmount: ");
        time = sc.nextInt();

        SimpleInterest = (principleAmount * rate * time) / 100;

        System.out.println("The simple interest for the given principal amount, rate and time is: " + SimpleInterest);

        System.out.println("The Total Amount is: " + (principleAmount + SimpleInterest));
    }
}
