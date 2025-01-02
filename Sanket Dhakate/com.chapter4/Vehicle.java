/* Create a class hierarchy: Vehicle → Car → ElectricCar. */
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    public void charge() {
        System.out.println("ElectricCar is charging.");
    }

    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.start();
        eCar.drive();
        eCar.charge();
    }
}
