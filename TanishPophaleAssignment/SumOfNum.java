// program to find the sum of a number

import java.util.Scanner;

public class SumOfNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while(temp!=0){
            sum += temp%10;
            temp = temp/10;
        }

        System.out.println("The sum of number " + num + " is: " + sum);
    }
}
