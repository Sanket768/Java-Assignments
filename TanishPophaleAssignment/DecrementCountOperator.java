// Program to use decrement operator to decrease a number to zero

import java.util.Scanner;

public class DecrementCountOperator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        int count = num;

        while(num!=0){
            num = num-1;
            count--;
        }

        System.out.println("The value of num is: " + num);

    }
}
