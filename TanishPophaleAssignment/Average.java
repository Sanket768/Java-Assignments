// Average of three int values

import java.util.Scanner;

public class Average {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of second integer: ");
        int b = sc.nextInt();

        System.out.println("Enter the value of third integer is: ");
        int c = sc.nextInt();

        double avg = (a + b + c)/3;

        System.out.println("The average of three integer is: " + avg);
    }
}
