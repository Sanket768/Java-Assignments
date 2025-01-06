// Create a BankAccount class with attributes like account number, balance, deposit, and withdraw methods.


class Bank{

    private int accNo;
    private double balance;

    public void deposit(int depositAmt){
        balance = balance + depositAmt;
        System.out.println("The amount " + depositAmt + " has been deposited to your bank account.");
    }

    public void withdraw(int withdrawAmt){
        
        if(withdrawAmt<=balance){
            balance = balance - withdrawAmt;
            System.out.println("The amount " + withdrawAmt + " has been successfully withdrawn from your bank account.");
        }
        else{
            System.out.println("The amount you entered is not available in your bank account. Thank You!");
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class BankMain {
    

    public static void main(String[] args) {
        
        Bank b1 = new Bank();
        b1.deposit(5000);
        System.out.println("The balance in the bank is: " + b1.getBalance());
        b1.withdraw(1200);
        System.out.println("The balance in the bank is: " + b1.getBalance());
    }
}
