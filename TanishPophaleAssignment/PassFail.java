// Write a program to check whether a student is pass or fail on marks

import java.util.Scanner;

public class PassFail {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for the student: ");
        int marks = sc.nextInt();

        if(marks>=37){
            System.out.println("The student is passed.");
        }
        else{
            System.out.println("The student is failed.");
        }
    }
}
