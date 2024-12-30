/* Implement a counter using the increment (++) operator */
package chapter2;
import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Counter using ++ operator:");
        while (counter < 5) {
            System.out.println("Counter = " + counter);
            counter++; 
        }
    }
}
