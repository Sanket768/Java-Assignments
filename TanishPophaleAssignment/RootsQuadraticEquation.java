// Program to calculate the roots of a quadratic equation

import java.util.Scanner;

public class RootsQuadraticEquation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a from quadratic equation: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b from quadratic equation: ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c from quadratic equation: ");
        int c = sc.nextInt();

        double root1 = ( -b + Math.sqrt((b*b) - 4*a*c) / 2*a);
        double root2 = ( -b - Math.sqrt((b*b) - 4*a*c) / 2*a);

        System.out.println("The roots for the given values of a, b and c's quadratic equation is: " + root1 + " " + root2);
    }
}
