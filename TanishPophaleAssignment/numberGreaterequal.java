// Program to check whether a number is greate, lesser or equal to another number

import java.util.Scanner;

public class numberGreaterequal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " is greater than " + b);
        }
        else if(a<b){
            System.out.println(a + " is lesser than " + b);
        }
        else{
            System.out.println(a+ " is equal to " + b);
        }
    }
}
