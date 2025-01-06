// Program to find sum of all even and odd numbers uptill n

import java.util.Scanner;

public class SumOfEvenOddNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }

        System.out.println("The sum of even number till number " + num + " is: " + evenSum);

        System.out.println("The sum of odd number till number " + num + " is: " + oddSum);

    }
}
