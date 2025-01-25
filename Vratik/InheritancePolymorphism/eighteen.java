/*
 * Create an interface Payment with methods pay() and refund(). Implement it in 
classes CreditCard and Wallet.
 */
interface Payment{
    public void pay();
    public void refund();
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying using credit card...");
    }
    @Override
    public void refund(){
        System.out.println("Refunding using credit card...");
    }
}
class Wallet implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying using wallet..");
    }
    @Override
    public void refund(){
        System.out.println("Refunding using wallet...");
    }
}
public class eighteen {
    public static void main(String[] args) {
        CreditCard cd = new CreditCard();
        Wallet wt = new Wallet();
        cd.pay();
        cd.refund();
        wt.pay();
        wt.refund();
    }
}
