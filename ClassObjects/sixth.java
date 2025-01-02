/* 6. Parameterized Constructor
Create a class Circle with a constructor that accepts the radius and calculates the area and circumference. */
class Circle {
    private float radius, area, circumference;

    public Circle(int r) {
        radius = r;
    }

    public void calculateArea() {
        area = 3.14f * radius * radius;
    }

    public void calculateCircumference() {
        circumference = 2 * 3.14f * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

}

public class sixth {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculateCircumference();
        circle.display();
    }
}
