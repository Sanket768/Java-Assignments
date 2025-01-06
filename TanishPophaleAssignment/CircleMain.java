// Create a class Circle with a constructor that accepts the radius and calculates the area and circumference.

class Circle{

    private double raidus;

    Circle(double raidus){
        this.raidus = raidus;
    }

    public double areaCircle(){
        return Math.PI * raidus * raidus;
    }

    public double circumCircle(){
        return 2 * Math.PI * raidus;
    }
}

public class CircleMain {
    
    public static void main(String[] args) {
        

        Circle c1 = new Circle(2.0);
        System.out.println("The area of circle is: " + c1.areaCircle());
        System.out.println("The circumference of a circle is: " + c1.circumCircle());
    }
}
