/* Write a program to find the position of the highest set bit in a number*/
package chapter2;
import java.util.Scanner;
public class HighestBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int position = -1;
        int index = 0;

        while (number != 0) {
            if ((number & 1) == 1) {
                position = index;
            }
            number >>= 1;
            index++;
        }

        if (position != -1) {
            System.out.println("The highest set bit is at position: " + position);
        } else {
            System.out.println("No set bits found.");
        }
    }
}
