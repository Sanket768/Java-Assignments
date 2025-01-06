// Create an interface Payment with methods pay() and refund(). Implement it in classes CreditCard and UPI.

interface Payment{
    void pay();
    void refund();
}

class CreditCard implements Payment{

    public void pay(){
        System.out.println("Pay using Credit Card.");
    }

    public void refund(){
        System.out.println("Refund using Credit Card.");
    }
}


class UPI implements Payment{

    public void pay(){
        System.out.println("Pay using UPI.");
    }

    public void refund(){
        System.out.println("Refund using UPI.");
    }
}

public class PaymentInterfaceMain {
    Payment p  = new CreditCard();
    p.pay();
    p.refund();
    
    Payment p1 = new UPI();
    p1.pay();
    p1.refund();


}
