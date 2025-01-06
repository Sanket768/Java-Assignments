// check whether three numbers form a Pythagorean triplet

import java.util.Scanner;

public class CheckPythagoreanTriplet {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side1: ");
        int side1 = sc.nextInt();

        System.out.println("Enter the side2: ");
        int side2 = sc.nextInt();

        System.out.println("Enter the side3: ");
        int side3 = sc.nextInt();
        if(((side1 * side1) + (side2 * side2)) == (side3 * side3)){
            System.out.println("The sides " + side1 + " " + side2 + " " + side3 + " form a pythagorean triplet");
        }
    }
}
