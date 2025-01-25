/*
 * Create a Vehicle class with subclasses Car, Bike, and Truck. Implement 
polymorphic methods to calculate insurance premiums.
 */
abstract class Vehicle{
    abstract void calculateInsurance();
}
class Car extends Vehicle{
    @Override
    void calculateInsurance(){
        System.out.println("Insurance premium for car: $1000");
    }
}
class Bike extends Vehicle{
    @Override
    void calculateInsurance(){
        System.out.println("Insurance premium for bike: $500");
    }
}
class Truck extends Vehicle{
    @Override
    void calculateInsurance(){
        System.out.println("Insurance premium for truck: $2000");
    }
}

public class twentyseven {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Truck();
        for(Vehicle v: vehicles){
            v.calculateInsurance();
        }
    }
}
