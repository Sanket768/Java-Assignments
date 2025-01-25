/*
 * Create an Order class with subclasses OnlineOrder and OfflineOrder. Implement polymorphic methods for calculateTotal().
 */
abstract class Order{
    abstract void calculateTotal();
}
class OnlineOrder extends Order{
    @Override
    void calculateTotal(){
        System.out.println("Calculating total for online order...");
    }
}
class OfflineOrder extends Order{
    @Override
    void calculateTotal(){
        System.out.println("Calculating total for offline order...");
    }
}

public class thirty {
    public static void main(String[] args) {
        Order[] orders = new Order[2];
        orders[0] = new OnlineOrder();
        orders[1] = new OfflineOrder();
        for(Order o: orders){
            o.calculateTotal();
        }
    }
}
