/*42 */
package chapter3;
import java.util.Scanner;
public class atmstimulator {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int balance = 15000; 
    int choice;

    do {
        System.out.println("\nATM Menu:");
        System.out.println("1.Check Balance");
        System.out.println(" 2.Deposit");
        System.out.println(" 3.Withdraw");
        System.out.println(" 4.Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("Deposit successful. New balance: " + balance);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdrawal = scanner.nextInt();
                if (withdrawal > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= withdrawal;
                    System.out.println("Withdrawal successful. New balance: " + balance);
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 4);

    scanner.close();
}
}
