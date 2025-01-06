import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a: ");
        a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        b = sc.nextInt();

        // Addition
        int c = a + b;
        System.out.println("The addition of a and b is: " + c);

        // Substraction
        int d = a - b;
        System.out.println("The substraction of a and b is: " + d);

        // Multiplication
        int e = a * b;
        System.out.println("The multiplication of a and b is: " + e);

        // Division
        int f = a/b;
        System.out.println("The division of a and b in integer is: " + f);

        // Modulo 
        int g = a % b;
        System.out.println("The modulo if a and b is: " + g);

    }
}
