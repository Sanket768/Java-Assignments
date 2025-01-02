/* Create a BankAccount class with attributes like account number, balance, deposit, and withdraw methods. */
public class BankAccount {
    int accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 12345;
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Balance: " + account.balance);
    }
}
