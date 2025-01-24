/* Create an abstract class Shape with an abstract method area(). Implement it in Circle and Square. */
abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
    }
}
