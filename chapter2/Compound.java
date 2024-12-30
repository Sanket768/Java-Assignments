/* Demonstrate how compound assignment operators work with different data types */
package chapter2;
import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        int x = 10;
        double y = 5.5;
        String str = "Hello";

        x += 5; 
        System.out.println("x += 5: x = " + x);

        y *= 2; 
        System.out.println("y *= 2: y = " + y);

        str += " World"; 
        System.out.println("str += ' World': str = " + str);
    }
}
