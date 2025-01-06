// Program to check if the first floating point number is greater than second.

import java.util.Scanner;

public class CompareFloatNumbers {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first floating point number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the second floating point number: ");
        double b = sc.nextDouble();

        if(a>b){
            System.out.println("The number " + a + " is greater than " + b);
        }
        else{
            System.out.println("THe number " + a + " is less than  b " + b);
        }
    }
}
