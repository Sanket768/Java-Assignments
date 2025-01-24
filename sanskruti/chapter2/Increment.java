/* Write a program to increment a variable by 10 until it exceeds 100. */
package chapter2;
import java.util.Scanner;
public class Increment {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Incrementing num by 10 until it exceeds 100:");
        while (num <= 100) {
            System.out.println("num = " + num);
            num += 10; 
        }
    }
}
