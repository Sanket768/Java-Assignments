// Program to perform operations on given user input operator

import java.util.Scanner;

public class OperationsUsingSwitchCase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value of num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator for which you have to do operation: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                int sum = num1+num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
                break;
        
            case '-':
                int diff = num1-num2;
                System.out.println("The diff of " + num1 + " and " + num2 + " is: " + diff);

            case '/':
                double div = num1/num2;
                System.out.println("The div of " + num1 + " and " + num2 + " is: " + div);

            case '*':
                int mul = num1*num2;
                System.out.println("The mul of " + num1 + " and " + num2 + " is: " + mul);

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
