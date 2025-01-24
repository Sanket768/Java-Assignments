/*
 * Create a base class Appliance. Extend it to Fan, AirConditioner, 
and Refrigerator, each with its own method.
 */
class Appliance {
    public void feature() {
        System.out.println("To automate recurring processes");
    }
}

class Fan extends Appliance {
    public void fanFeature() {
        System.out.println("To provide normal cooling inside the house");
    }
}

class AirConditioner extends Fan {
    public void ACfeature() {
        System.out.println("To provide extreme cooling inside the house");
    }
}

class Refrigerator extends AirConditioner {
    public void refrigeratorFeature() {
        System.out.println("To store vegetables, fruits, diary products & food in cool container");
    }
}

public class sixth {
    public static void main(String[] args) {
        Appliance app = new Appliance();
        app.feature();
        Fan fan = new Fan();
        fan.feature();
        fan.fanFeature();
    }
}
