/* Write a program to check if 
   a year is a leap year using logical operators. */
import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }
        else if(year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
