/*
    Calculate the average of three numbers using arithmetic operators. 
*/
import java.util.*;
public class second {
    public static void main(String[] args) {
        float num1, num2, num3, average;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            num1 = sc.nextFloat();
            System.out.println("Enter the second number:");
            num2 = sc.nextFloat();
            System.out.println("Enter the third number:");
            num3 = sc.nextFloat();
            average = (num1 + num2 + num3)/3;

            System.out.println("Average of three numbers are: " + average);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
