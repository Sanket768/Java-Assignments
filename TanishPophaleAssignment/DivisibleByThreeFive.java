// Program to check the number is divisible by 3 and 5

import java.util.Scanner;

public class DivisibleByThreeFive {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked: ");
        int num = sc.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("The number is divisible by both 3 and 5.");
        }
        else{
            System.out.println("The number is not divisible by 3 and 5.");
        }
    }
}
