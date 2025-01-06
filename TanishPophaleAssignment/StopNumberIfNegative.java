// Program which should accept the number and should stop if number is negative.

import java.util.Scanner;

public class StopNumberIfNegative {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        while(true){
            if(num<0){
                System.out.println("Number entered is negative.");
                break;
            }

            System.out.println("Enter the number again to continue the loop: ");
            num = sc.nextInt();

        }
    }
}
