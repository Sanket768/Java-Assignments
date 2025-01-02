/* Evaluate the area of a triangle using Heron’s formula. */
import java.util.Scanner;
class Heron {
    private double s;
    private double a, b, c;

    public Heron(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2;
    }

    public double evalute(){
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class thirtyfive {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter then sides of the triangle:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            Heron h = new Heron(a, b, c);
            System.out.println("The area of the triangle is: " + h.evalute());
        }
    }
}
