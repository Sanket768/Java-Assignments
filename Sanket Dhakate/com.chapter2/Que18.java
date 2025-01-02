/* Swap two numbers using the bitwise XOR operator. */
public class Que18 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 40;
        System.out.println("Before: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After: num1 = " + num1 + ", num2 = " + num2);
    }
}
