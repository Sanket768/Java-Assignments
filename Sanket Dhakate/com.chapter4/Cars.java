/* Create a Car class that contains an Engine class as a part of its composition. */
class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }
}

class Cars {
    String brand;
    Engine engine;

    public Cars(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.type);
    }

    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Cars car = new Cars("Ford", engine);
        car.displayDetails();
    }
}
