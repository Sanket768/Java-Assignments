class Vehicle {
    public void abc(){
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle {
    public void def(){
        System.out.println("Car");
    }
}
class ElectricCar extends Car {
    public void ghi(){
        System.out.println("Electric Car");
    }
}

class man {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.abc();
        ec.abc();
        ec.ghi();
    }
}