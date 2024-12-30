/* Evaluate the area of a triangle using Heron’s formula */
package chapter2;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        int s = (a + b + c) / 2; 
        double  area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 

        System.out.println("Area of the triangle is: " + area);

        scanner.close();
    }
}
