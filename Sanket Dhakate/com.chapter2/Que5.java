/* Compute the volume of a cube, cylinder, 
   and cone using expressions. */

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();
        double cubeVolume = Math.pow(sideLength, 3);
        System.out.println("Volume of the cube: " + cubeVolume);

        System.out.print("Enter the radius of the cylinder: ");
        double radiusCylinder = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double heightCylinder = scanner.nextDouble();
        double cylinderVolume = Math.PI * Math.pow(radiusCylinder, 2) * heightCylinder;
        System.out.println("Volume of the cylinder: " + cylinderVolume);

        System.out.print("Enter the radius of the cone: ");
        double radiusCone = scanner.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double heightCone = scanner.nextDouble();
        double coneVolume = (1.0 / 3.0) * Math.PI * Math.pow(radiusCone, 2) * heightCone;
        System.out.println("Volume of the cone: " + coneVolume);

        scanner.close();
    }
}
