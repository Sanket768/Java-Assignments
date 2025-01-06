// Program to find the count of digits present in the number.

import java.util.Scanner;

public class CountnumOfDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        int rev = num;
        int count = 0;

        while(rev!=0){
            count++;
            rev = rev/10;    
        }

        System.out.println("The number of digits present in the number " + num + " is " + count);
    }
}
