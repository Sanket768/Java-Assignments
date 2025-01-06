// Program to check whether the person is eligible for senior citizen or not using Ternary Operator

import java.util.Scanner;

public class SeniorCitizenCheck {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        boolean isEligible = (age>=65) ? true : false;

        if(isEligible){
            System.out.println("You are eligible for senior citizen.");
        }
        else{
            System.out.println("You are not eligible for senior citizen.");
        }
    }
}
