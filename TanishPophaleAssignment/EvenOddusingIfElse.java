// Program to check whether number is positive, negative or zero using if else

import java.util.Scanner;

public class EvenOddusingIfElse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Number " + num  + " is positive.");
        }
        else if(num<0){
            System.out.println("Number " + num  + " is negative.");
        }
        else{
            System.out.println("Number " + num  + " is zero.");
        }

    }
}
