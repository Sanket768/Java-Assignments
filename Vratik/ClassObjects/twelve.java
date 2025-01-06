/*
 * Create a class hierarchy: o Vehicle → Car → ElectricCar.
 */
class Vehicle {
    private int speed;
    private int year;

    public Vehicle(int speed, int year) {
        this.speed = speed;
        this.year = year;
    }

    public void display() {
        System.out.println("Vehicle speed: " + speed + " year: " + year);
    }
}

class Car extends Vehicle {
    private String brand;
    private String color;

    public Car(int speed, int year, String brand, String color) {
        super(speed, year);
        this.brand = brand;
        this.color = color;
    }

    public void display() {
        System.out.println("Car brand: " + brand + " color: " + color);
    }
}

class ElectricCar extends Car {
    private int battery;

    public ElectricCar(int speed, int year, String brand, String color, int battery) {
        super(speed, year, brand, color);
        this.battery = battery;
    }

    public void display() {
        System.out.println("ElectricCar battery: " + battery);
    }
}

public class twelve {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(100, 2022, "Tesla", " Red", 100);
        ElectricCar electricCar1 = new ElectricCar(120, 2023, "Tesla", " Blue", 120);
        electricCar.display();
        electricCar1.display();
    }
}
