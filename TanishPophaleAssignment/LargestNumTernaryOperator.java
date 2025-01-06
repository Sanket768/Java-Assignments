// Program to find largest of three numbers using ternary operator

import java.util.Scanner;

public class LargestNumTernaryOperator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        int largestNum = (num1>num2 && num1>num3) ? num1 : ((num2>num1 && num2>num3) ? num2 : num1);
        
        System.out.println("The largest of three numbers is: " + largestNum);
    }
}
