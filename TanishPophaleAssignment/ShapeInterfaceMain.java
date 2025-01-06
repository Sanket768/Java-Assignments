// Create an interface Shape with a method draw(). Implement it in Circle, Rectangle, and Triangle.

interface Shape {
    void draw();    
}

class CircleClass implements Shape{
    public void draw(){
        System.out.println("This is circle class.");
    }
}

class RectangleClass implements Shape{
    public void draw(){
        System.out.println("This is rectangle class.");
    }
}

class TriangleClass implements Shape{
    public void draw(){
        System.out.println("This is triangle class.");
    }
}

public class ShapeInterfaceMain {
    
    public static void main(String[] args) {
        
        Shape s = new CircleClass();
        s.draw();

        Shape s1 = new RectangleClass();
        s1.draw();;

        Shape s2 = new TriangleClass();
        s2.draw();
    }
}
