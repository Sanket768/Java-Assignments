/*
 * Create an abstract class Shape with an abstract method area(). Extend it 
in Circle and Triangle to implement their specific areas.
 */
class Shape2{
    public void area(){

    }
}
class Circle1 extends Shape2{
    public void area(){
        System.out.println(Math.PI*4.25*4.25);
    }
}
class Triangle extends Shape2{
    public void area(){
        System.out.println(23*34*56);
    }
}
public class sixteen {
    public static void main(String[] args) {
        Circle1 cl = new Circle1();
        Triangle tr = new Triangle();
        cl.area();
        tr.area();
    }
}
