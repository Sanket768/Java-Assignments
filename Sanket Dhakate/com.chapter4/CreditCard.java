/* Create an interface Payment with methods pay() and refund(). Implement it in classes CreditCard and UPI. */
interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card.");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to UPI.");
    }

    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        Payment upi = new UPI();

        creditCard.pay(1000);
        upi.refund(500);
    }
}
