/*
 * Create an abstract class Shape with an abstract method area(). Implement it in Circle and Square.
 */
abstract class Shape1 {
    abstract float area();
}

class Circle1 extends Shape1 {
    float radius;

    Circle1(float r) {
        radius = r;
    }

    float area() {
        return 3.14f * radius * radius;
    }
}

class Square1 extends Shape1 {
    float side;

    Square1(float s) {
        side = s;
    }

    float area() {
        return side * side;
    }
}

public class seventeenth {
    public static void main(String[] args) {
        Circle1 c = new Circle1(5);
        Square1 s = new Square1(4);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Square: " + s.area());
    }
}
