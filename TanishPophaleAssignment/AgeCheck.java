// Program to checl whether age is greater than 0 and less than 150

import java.util.Scanner;

public class AgeCheck {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age>0 && age<150){
            System.out.println("The age is within range.");
        }
        else{
            System.out.println("The age is out of range.");
        }
    }
}
