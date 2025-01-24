/* Check if three given numbers can form a Pythagorean triplet. */

import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int a, b, c;

        if (num1 >= num2 && num1 >= num3) {
            c = num1;
            a = num2;
            b = num3;
        } else if (num2 >= num1 && num2 >= num3) {
            c = num2;
            a = num1;
            b = num3;
        } else {
            c = num3;
            a = num1;
            b = num2;
        }

        if (a * a + b * b == c * c) {
            System.out.println("Yes, the numbers can form a Pythagorean triplet.");
        } else {
            System.out.println("No, the numbers cannot form a Pythagorean triplet.");
        }

        scanner.close();
    }
}
