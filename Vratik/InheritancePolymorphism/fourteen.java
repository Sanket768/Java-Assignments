/*Create a base class Shape with a method draw(). Override it in 
subclasses Circle and Rectangle and demonstrate runtime polymorphism. */
class Shape1{
    public void draw(){
    }
}
class Circle extends Shape1{
    public void draw(){
        System.out.println("This is Circle");
    }
}
class Rectangle extends Shape1{
    public void draw(){
        System.out.println("This is Rectangle");
    }
}
public class fourteen {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        r.draw();
    }
}
