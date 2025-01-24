/*
 * Create a base class Vehicle with a method fuelEfficiency(). Override it in 
subclasses Bike and Car to provide specific implementations.
 */
class Vehicle1 {
    public void fuelEfficiency() {
        System.out.println("Vehicles have fuel efficiency mechanism");
    }
}

class Bike extends Vehicle1 {
    public void fuelEfficiency() {
        System.out.println("Bike has normal fuel efficiency than cars.");
    }
}

class Cars extends Vehicle1 {
    public void fuelEfficiency() {
        System.out.println("Cars are most efficient in terms of fuel");
    }
}

public class eight {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.fuelEfficiency();
        Cars c = new Cars();
        c.fuelEfficiency();
    }
}
