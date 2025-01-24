/*
 * Create a class Vehicle with a method move(). Extend it to Car and then 
to ElectricCar, adding new methods at each level.
 */
class Vehicle{
    public void move(){

    }
}
class Car extends Vehicle{
    public void move(){
        System.out.println("Car is moving");
    }
}
class ElectricCar extends Vehicle{
    public void move(){
        System.out.println("ElectricCar is moving");
    }
}
public class forth {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        ElectricCar elecCar = new ElectricCar();
        elecCar.move();
        
    }
}
