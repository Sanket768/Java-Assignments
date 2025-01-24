/* Create a class Rectangle with methods to calculate area and perimeter. Accept the dimensions via a constructor. */
public class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
