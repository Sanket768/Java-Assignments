


    
public class Rectangle {
    
    
    double width, height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double calculateArea() {
        return width * height;
    }

    
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}


