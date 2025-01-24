/* Evaluate the area of a triangle using Heron’s formula. */

import java.util.Scanner;

class Que35{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;

        if (a + b > c && a + c > b && b + c > a) {
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The entered sides do not form a valid triangle.");
        }

        scanner.close();
    }
}