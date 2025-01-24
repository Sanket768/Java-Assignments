/*  write a program to check if a number is grater than ,lessthan or eqals to another number */

package chapter2;
import java.util.Scanner;

public class ComparatorNumber {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System .out .println(" enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();
        if (num1>num2){
            System.out.println(num1+" is greater than "+ num2);
        }else if (num1<num2){
            System.out.println(num1+" is less than "+ num2);

        }else if ( num1==num2){
            System.out.println(num1 +" is equal to "+ num2);
        }

        scanner.close();
    }
    
}
