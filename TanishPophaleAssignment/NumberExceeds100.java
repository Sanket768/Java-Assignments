// Program to add 10 to a variable until it exceeds 100

import java.util.Scanner;

public class NumberExceeds100 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num  = sc.nextInt();

        if(num>100){
            System.out.println("Sorry we cant add 10 to your number since it should be less than 100.");
        }
        else{
            while(num<=100){
                num+=10;
            }

            System.out.println("The final value of a number entered by adding 10 is: " + num);
        }

        

        
    }
}
