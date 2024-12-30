
/*
 * Find the area and circumference of a circle using arithmetic expressions.
 */
import java.util.*;

class AreaAndCircumference {
    private double radius;

    public AreaAndCircumference(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }
}

public class fourth {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            AreaAndCircumference circle = new AreaAndCircumference(radius);
            System.out.println("The area of the circle is: " + circle.area());
            System.out.println("The perimeter of the circle is: " + circle.circumference());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number." + e.getMessage());
        }
    }
}
