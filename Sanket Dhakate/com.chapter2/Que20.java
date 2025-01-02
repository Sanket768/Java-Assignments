/* Write a program to find the position of the highest set bit in a number. */

import java.util.Scanner;

class Que20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int position = -1;
        int bitIndex = 0;

        while (number != 0) {
            if ((number & 1) == 1) {
                position = bitIndex; 
            }
            number >>= 1;
            bitIndex++;
        }

        if (position != -1) {
            System.out.println("The position of the highest set bit is: " + position);
        } else {
            System.out.println("No set bits found.");
        }

        scanner.close();
    }
}