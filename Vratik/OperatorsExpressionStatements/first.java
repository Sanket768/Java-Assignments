/*
 * 1. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integers.
 */
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int num1,num2;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        if(num2!=0)
        {
            System.out.println("Division: "+(num1/num2));
        }
        else
        {
            System.out.println("Error! Division by zero is not allowed.");
        }
        System.out.println("Modulus: "+(num1%num2));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}