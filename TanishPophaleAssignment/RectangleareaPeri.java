// Perimeter and Area of a Rectangle

import java.util.Scanner;

public class RectangleareaPeri {
    
    public static void main(String[] args){
        double area, peri;
        double len, breadth;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        len = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();

        area = len * breadth;
        peri =  2 * ( len + breadth);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + peri);
    }
}
