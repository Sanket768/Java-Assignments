// Program to find area of triangle using Herons Formula

import java.util.Scanner;

public class AreaTriangleUsingHeronsFormula {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the side1: ");
        int side1 = sc.nextInt();

        System.out.println("Enter the side2: ");
        int side2 = sc.nextInt();

        System.out.println("Enter the side3: ");
        int side3 = sc.nextInt();

        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s-side1) * (s- side2) * (s-side3));

        System.out.println("The area of triangle using herons formula is: " + area);



        
    }
}
