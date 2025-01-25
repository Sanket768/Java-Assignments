/*
 * Overload a method draw() in the Shape class to handle different numbers of 
parameters (e.g., radius, length and width).
 */
class shapes{
    public void draw(double length, double width){
        System.out.println(length*width);
    }
    public void draw(float radius){
        System.out.println(Math.PI*radius*radius);
    }
}
public class thirteen {
    public static void main(String[] args) {
        shapes sp = new shapes();
        sp.draw(4.3323, 3.6);
        sp.draw(4);
    }
}
