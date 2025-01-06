// Program to check whether a year is Leap or Not

import java.util.Scanner;

public class LeapYear {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0)){
            System.out.println("The year " + year + " is a Leap Year.");
        }
        else{
            System.out.println("The year is " + year + " is not a Leap Year.");
        }
    }
}
