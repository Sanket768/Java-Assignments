/* Demonstrate the use of +=, -=, *=, /=, and %= operators in a program.*/
package chapter2;
import java.util.Scanner;
public class DemonstrateOperator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Initial values: a = " + a + ", b = " + b);

        a += b; 
        System.out.println("After a += b: a = " + a);

        a -= b; 
        System.out.println("After a -= b: a = " + a);

        a *= b; 
        System.out.println("After a *= b: a = " + a);

        a /= b; 
        System.out.println("After a /= b: a = " + a);

        a %= b; 
        System.out.println("After a %= b: a = " + a);
    }
}
