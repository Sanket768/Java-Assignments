/*
 * Create a base class Payment with a method processPayment(). Override it in 
subclasses CreditCardPayment and UPIPayment.
 */
class Payment{
    public void processPayment(){
        System.out.println("Processing payment...");
    }
}
class CreditCardPayment extends Payment{
    public void processPayment(){
        System.out.println("Processing Payment with Credit Card....");
    }
}
class UPIPayment extends Payment{
    public void processPayment(){
        System.out.println("Processing payment with UPI Id....");
    }
}
public class nine {
    public static void main(String[] args) {
        CreditCardPayment cp = new CreditCardPayment();
        cp.processPayment();
        UPIPayment up = new UPIPayment();
        up.processPayment();
    }
}
