/* Calculate the area and perimeter of a rectangle using int or double variables. */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int length, width;
        double area, perimeter;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the length of the Rectangle: ");
            length = sc.nextInt();
            System.out.println("Enter the width of the Rectangle: ");
            width = sc.nextInt();
            area = length * width;
            perimeter = 2 * (length + width);
            System.out.println("Area of Rectangle: " + area);
            System.out.println("Perimeter of Rectangle: " + perimeter);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
