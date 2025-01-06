/* Create a custom exception InsufficientBalanceException and handle it in 
a BankAccount class. */
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        try {
            account.withdraw(600.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}