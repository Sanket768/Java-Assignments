// Create a class hierarchy: Vehicle → Car → ElectricCar.

class Vehicle{
    void sound(){
        System.out.println("It is Vehicle class.");
    }
}

class Car extends Vehicle{
    void sound(){
        System.out.println("It is Car class.");
    }
}

class ElectricCar extends Car{
    void sound(){
        System.out.println("It is Electric Car class.");
    }
}

public class VehicleMain {

    public static void main(String[] args) {
        
        ElectricCar ec = new ElectricCar();
        ec.sound();
    }
}