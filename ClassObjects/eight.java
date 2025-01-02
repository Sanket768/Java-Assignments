/*
 * 8. Overloaded Constructor
Implement a Car class with multiple constructors to handle different sets of attributes.I
 */
class Car{
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String color;
    private String transmission;
    private String engine;
    private int horsepower;
    private int cylinders;
    private int doors;
    private int wheels;
    private int seats;
    private int price;
    private int speed;
    
    public Car(String brand, String model, int year, int mileage, String color, String transmission, String engine, int horsepower, int cylinders, int doors, int wheels, int seats, int price, int speed){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.doors = doors;
        this.wheels = wheels;
        this.seats = seats;
        this.price = price;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Engine: " + engine);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Doors: " + doors);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
    }
}
public class eight {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2015, 50000 , "Blue", "Automatic", "V6", 200, 6, 4, 16, 5, 25000, 120);
        car.display();
    }
}
