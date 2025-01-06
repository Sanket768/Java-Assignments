/*
 * Create an interface Payment with methods pay() and refund(). Implement it in classes CreditCard and UPI.
 */
interface Payment {
    void pay();
}

interface Refund {
    void refund();
}

abstract class CreditCard implements Payment, Refund {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }

    public void refund() {
        System.out.println("Refunded using Credit Card");
    }
}

abstract class UPI implements Payment, Refund {
    public void pay() {
        System.out.println("Paid using UPI");
    }

    public void refund() {
        System.out.println("Refunded using UPI");
    }
}

public class eighteenth {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard() {
            @Override
            public void pay() {
                System.out.println("Paid using Credit Card");
            }
        };
        creditCard.pay();
        creditCard.refund();
        UPI upi = new UPI() {
            @Override
            public void pay() {
                System.out.println("Paid using UPI");
            }
        };
        upi.pay();
        upi.refund();
    }
}
