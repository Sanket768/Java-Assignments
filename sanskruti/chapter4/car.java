

public class car {
    


    
    String model;
    int year;
    String color;

    
    public car() {
        this.model = "Unknown";
        this.year = 2000;
        this.color = "White";
    }

    
    public car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Black"; 
    }

    
    public car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car("Toyota", 2021);
        car car3 = new car("Honda", 2023, "Red");

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}


