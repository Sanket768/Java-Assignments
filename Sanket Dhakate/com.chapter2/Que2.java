/* Calculate the average of three numbers 
 * using arithmetic operators.
 */

import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        float avg = (a + b + c) / 3;
        System.out.println("Average: " + avg);
    }
    
}
