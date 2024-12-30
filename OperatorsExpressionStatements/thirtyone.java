
/* 
 * Calculate the roots of a quadratic equation using an expression.
 */
import java.util.*;

class QuadraticRoots {
    private double a, b, c;

    public QuadraticRoots(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] getRoots() {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return new double[] { -1, -1 };
        } else if (d == 0) {
            return new double[] { (-b + Math.sqrt(d)) / (2 * a) };
        } else {
            return new double[] { (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a) };
        }
    }
}

public class thirtyone {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the coefficients of the quadratic equation (a, b, c): ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            QuadraticRoots roots = new QuadraticRoots(a, b, c);
            double[] result = roots.getRoots();
            System.out.println("The roots of the quadratic equation are: " + Arrays.toString(result));
        }
    }
}
