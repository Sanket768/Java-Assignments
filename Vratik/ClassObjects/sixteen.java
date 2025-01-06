/* Create an interface Shape with a method draw(). Implement it 
in Circle, Rectangle, and Triangle. */
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class sixteen {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
