/* write a program to check if a year is a leap year using logical operator  */
package chapter2;
import java.util.Scanner;
public class LeapYear {
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a year :");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
            System.out.println(year + " is a leap year ");
        }else{
            System.out.println(year + " is not a leap year ");
        }

     }
}
