/*
 * Create a BankAccount class with methods deposit() and withdraw(). Override 
these methods in SavingsAccount and CurrentAccount.
 */
abstract class BankAccount{
    abstract void deposit();
    abstract void withdraw();
}
class SavingsAccount extends BankAccount{
    @Override
    void deposit(){
        System.out.println("Depositing in savings account...");
    }
    @Override
    void withdraw(){
        System.out.println("Withdrawing from savings account...");
    }
}
class CurrentAccount extends BankAccount{
    @Override
    void deposit(){
        System.out.println("Depositing in current account...");
    }
    @Override
    void withdraw(){
        System.out.println("Withdrawing from current account...");
    }
}

public class twentysix {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        sa.deposit();
        sa.withdraw();
        ca.deposit();
        ca.withdraw();
    }
}
