// Program to find the whether the age entered is valid for voting and driving license

import java.util.Scanner;

public class ValidAgeForElectionLicense {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age>=16 && age<18){
            System.out.println("The person is eligible for license but not for election.");
        }
        else if(age>=18){
            System.out.println("The person is eligible for both license and elections");
        }
        else{
            System.out.println("The person is not eligible for both license and election.");
        }
    }
}
