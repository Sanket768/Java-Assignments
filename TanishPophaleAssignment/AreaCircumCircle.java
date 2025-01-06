// Program to find area and circumference of a circle

import java.util.Scanner;

public class AreaCircumCircle {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the raidus of a circle: ");
        double raidus = sc.nextDouble();

        double area = Math.PI * (raidus * raidus);
        System.out.println("The area of a circle is: " + area);

        double circumference = 2 * (Math.PI) * raidus;
        System.out.println("The circumference of a circle is: " + circumference);
    }
}
