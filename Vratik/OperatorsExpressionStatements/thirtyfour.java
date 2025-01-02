/*
 * Write a program to solve the equation: (a + b)^3.
 */
import java.util.Scanner;
class Equation {
    private int a, b;

    public Equation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double solve() {
        return (Math.pow(a, 3) + Math.pow(b, 3) + 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2));
    }
}

public class thirtyfour {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();
            Equation equation = new Equation(a, b);
            System.out.println("The solution to the equation is: " + equation.solve());
            }
    }
}
