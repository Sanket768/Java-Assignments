/* Validate user input using logical 
   conditions (e.g., age > 0 and age < 150). */

import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age > 0 && age < 150) {
            System.out.println("Valid age.");
        } else {
            System.out.println("Invalid age.");
        }        
    }
}
