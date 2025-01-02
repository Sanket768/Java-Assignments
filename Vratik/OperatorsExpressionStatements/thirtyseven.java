
/* Write a program to find the maximum of three numbers using nested if-else. */
import java.util.Scanner;

class MaxThree {
    private int a, b, c;

    public void findMax() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
            System.out.println("Enter the third number:");
            c = sc.nextInt();
            if (a > b) {
                if (a > c) {
                    System.out.println("The maximum number is " + a);
                } else {
                    System.out.println("The maximum number is " + c);
                }
            } else {
                if (b > c) {
                    System.out.println("The maximum number is " + b);
                } else {
                    System.out.println("The maximum number is " + c);
                }
            }
        }
    }
}

public class thirtyseven {
    public static void main(String[] args) {
        MaxThree max = new MaxThree();
        max.findMax();
    }
}