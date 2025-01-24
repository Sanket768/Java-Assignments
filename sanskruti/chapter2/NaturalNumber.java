/* 24. Write a program to calculate the sum of the first n natural numbers using an
assignment operator. */
package chapter2;
import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        int n = 10; 
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        System.out.println("Sum of the first " + n + " natural numbers = " + sum);
    }
}
