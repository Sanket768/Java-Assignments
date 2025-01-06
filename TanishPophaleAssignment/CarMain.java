// Implement a Car class with multiple constructors to handle different sets of attributes.

class Car{

    private int wheels;
    private String carName;
    private String companyName;

    Car(int wheels){
        this.wheels = wheels;
        this.carName = "Mercedes Benz E230d";
        this.companyName = "Mercedes";
    }

    Car(int wheels, String carName){
        this.wheels = wheels;
        this.carName = carName;
        this.companyName = "BMW";
    }

    Car(int wheels, String carName, String companyName){
        this.wheels = wheels;
        this.carName = carName;
        this.companyName = companyName;
    }

    public void printCarDetails(){
        System.out.println("The Car details are: ");
        System.out.println("Car Wheels: " + wheels);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Company Name: " + companyName);
        System.out.println("");
    }
}

public class CarMain {
    
    public static void main(String[] args) {
        
        Car c1 = new Car(4);
        c1.printCarDetails();

        Car c2 = new Car(6, "BMW X7");
        c2.printCarDetails();

        Car c3 = new Car(4, "Rolls Royce Phantom", "Rolls Royce");
        c3.printCarDetails();

    }
}
