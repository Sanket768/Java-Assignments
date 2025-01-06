// Program to solve a^2 + 2ab + b^2 equation in java

import java.util.Scanner;

public class EquationEvaluation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a from quadratic equation: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b from quadratic equation: ");
        int b = sc.nextInt();

        int result = (a*a) + 2*a*b + (b*b);
        
        System.out.println("The result of the given values of a and b of the given expression is: " + result);
    }
}
