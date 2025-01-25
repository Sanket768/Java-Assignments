/*Create a Travel class with subclasses Flight, Bus, and Train. Demonstrate 
polymorphism in ticket booking and cancellation. */
abstract class Travel{
    abstract void bookTicket();
    abstract void cancelTicket();
}
class Flight extends Travel{
    @Override
    void bookTicket(){
        System.out.println("Flight ticket booked.");
    }
    @Override
    void cancelTicket(){
        System.out.println("Flight ticket cancelled.");
    }
}
class Bus extends Travel{
    @Override
    void bookTicket(){
        System.out.println("Bus ticket booked.");
    }
    @Override
    void cancelTicket(){
        System.out.println("Bus ticket cancelled.");
    }
}
public class thirtytwo {
    public static void main(String[] args) {
        Travel[] travels = new Travel[2];
        travels[0] = new Flight();
        travels[1] = new Bus();
        for(Travel t: travels){
            t.bookTicket();
            t.cancelTicket();
        }
    }
}
