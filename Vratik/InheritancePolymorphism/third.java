/*
 * Create a base class Shape with a method area(). Extend it to create Circle and Rectangle classes that implement their own versions of area().
 */
class Shape{
    public Double area;
    public void area(){
    }
}
class Circle extends Shape{
    private Double radius = 10.00;

    public void area(){
        System.out.println(Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    private Double length = 18.00;
    private Double breadth = 34.00;

    public void area(){
        System.out.println(length * breadth);
    }
}
public class third {
    public static void main(String[] args) {
        Circle area1 = new Circle();
        area1.area();
        Rectangle area2 = new Rectangle();
        area2.area();
    }
}
