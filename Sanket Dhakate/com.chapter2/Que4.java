/* Find the area and circumference of a circle 
   using arithmetic expressions. */
import java.util.Scanner;
public class Que4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scan.nextDouble();
        double PI = 3.14;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area of circle is " + area);
        System.out.println("Circumference of circle is " + circumference);
    }
}
