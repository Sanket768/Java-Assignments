

public class BankAccountStimulation {
    


    
    private int accountNumber;
    private double balance;

    
    public BankAccountStimulation(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    
    public static void main(String[] args) {
        BankAccountStimulation account = new BankAccountStimulation (12345, 1000);
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
    }
}


