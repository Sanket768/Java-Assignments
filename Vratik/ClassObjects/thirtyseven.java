/*
 * Create a custom exception InsufficientBalanceException and handle it in a BankAccount class.
 */
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class thirtyseven {
    private double balance;
    public thirtyseven(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException("Insuffiecient balance to withdraw " + amount);
        }
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        thirtyseven act = new thirtyseven(1000);
        try{
            act.withdraw(1500);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
