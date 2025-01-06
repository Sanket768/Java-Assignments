// Given the no of days, calculate the month and year.


import java.util.Scanner;

public class NoOfYearsMonths {
    
    public static void main(String[] args){

        int days;
        System.out.println("Enter the no of days: ");
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();

        System.out.println("The no of days entered is: " + days);

        double months = days/30.41;
        System.out.println("The value of the month on the entered days is: " + months);

        double year = days/365;
        System.out.println("The value of year is: " + year);

        
    }
}
