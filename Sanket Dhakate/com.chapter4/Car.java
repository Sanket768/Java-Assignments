/* Implement a Car class with multiple constructors to handle different sets of attributes. */
public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic", 2020);

        System.out.println("Car1: " + car1.make + " " + car1.model);
        System.out.println("Car2: " + car2.make + " " + car2.model + " " + car2.year);
    }
}
