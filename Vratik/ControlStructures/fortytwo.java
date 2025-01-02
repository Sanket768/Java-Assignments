
/* Implement a basic ATM simulator with a menu-driven interface. */
import java.util.*;

public class fortytwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            int balance = 1000;
            while (true) {
                System.out.println("\nATM Simulator");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Deposit Cash");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your current balance is: $" + balance);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: $");
                        int withdraw = sc.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Enter the amount to deposit: $");
                        long deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("Deposit successful. Your new balance is: $" + balance);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
