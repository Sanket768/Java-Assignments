/*
 * 5. Bank Account Simulation
Create a BankAccount class with attributes like account number, balance, deposit, and withdraw methods.
 */
class BankAccount {
    private long acctno;
    private double balance;

    public BankAccount(long acctno, double balance) {
        this.acctno = acctno;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    public void getBalance() {
        System.out.println("Current Balance: " + balance);
    }

}

public class fifth {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, 1000.0);
        account.getBalance();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
        account.getBalance();
    }
}
