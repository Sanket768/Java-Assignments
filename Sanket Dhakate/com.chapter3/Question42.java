/* Implement a basic ATM simulator with a menu-driven interface. */
import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int pin = 1234;
        int enteredPin;

        System.out.print("Enter PIN: ");
        enteredPin = scanner.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            return;
        }

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Deposited: $" + deposit);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn: $" + withdraw);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
