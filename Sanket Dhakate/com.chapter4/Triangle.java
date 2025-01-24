/* Create an interface Shape with a method draw(). Implement it in Circle, Rectangle, and Triangle. */
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing Triangle.");
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
