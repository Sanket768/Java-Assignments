/* perform bitwise AND OR XOR left shift and right shift operation on two intergs  */
package chapter2;
import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Bitwise AND (a & b): " + (a & b));
        System.out.println("Bitwise OR (a | b): " + (a | b));
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b));
        System.out.println("Left Shift a (a << 1): " + (a << 1));
        System.out.println("Right Shift b (b >> 1): " + (b >> 1));
}
}
