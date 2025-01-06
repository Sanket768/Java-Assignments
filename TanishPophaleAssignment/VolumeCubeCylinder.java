// Volume of Cube, Cylinder, Cone

import java.util.Scanner;

public class VolumeCubeCylinder {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the raidus: ");
        double raidus = sc.nextDouble();

        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        double VolumeCube = raidus * raidus * raidus;
        System.out.println("The value of cube is: " + VolumeCube);

        double VolumeCyclinder = Math.PI * raidus * raidus * height;
        System.out.println("The volume of cyclinder is: " + VolumeCyclinder);

        double VolumeCone = (Math.PI * raidus * raidus * height)/3;
        System.out.println("The volume of cone is: " + VolumeCone);
    }
}
