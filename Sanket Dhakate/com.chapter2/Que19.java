/* Count the number of set bits (1s) in a binary representation of a number. */

import java.util.Scanner;

class Que19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number >>= 1;
        }

        System.out.println("Number of set bits: " + count);

        scanner.close();
    }
}