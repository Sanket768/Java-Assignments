/* Convert temperature from Celsius to Fahrenheit. */

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        float degrees = scan.nextInt();
        float fahrenheit = (degrees * 9/5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
