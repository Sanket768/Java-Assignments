/*
 * Create an array of Shape objects (Circle, Rectangle) and call their 
respective draw() and area() methods using a loop.
 */
abstract class Shape{
    abstract void draw();
    abstract void area();
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle...");
    }
    @Override
    void area(){
        System.out.println("Calculating area of circle...");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a rectangle...");
    }
    @Override
    void area(){
        System.out.println("Calculating area of rectangle...");
    }
}

public class twentythree {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for(Shape s: shapes){
            s.draw();
            s.area();
        }
    }
}
