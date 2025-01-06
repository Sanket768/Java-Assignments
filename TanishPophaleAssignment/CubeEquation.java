// Program to solve the given equation - (a^b)3

import java.util.Scanner;

public class CubeEquation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        
        int result = (int)Math.pow(a, 3) + 3*a*a*b + 3*a*b*b + (int)Math.pow(b, 3);

        System.out.println("The result of the equation on the value of a and b provided is: " + result);

    }
}
