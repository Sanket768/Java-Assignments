// Program to find sum of n natural numbers

import java.util.Scanner;

public class SumNaturalNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which you want to add natual numbers: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=num;i++){
            sum += num;
        }

        System.out.println("The sum of " + num + " natural numbers is: " + sum);
    }
}
