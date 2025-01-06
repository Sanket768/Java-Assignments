// Program to find prime number

import java.util.Scanner;

public class CheckPrimeNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int flag = 1;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag = 0;
                break;
            }
        }

        if(flag==1){
            System.out.println(num + " is not a pallindrome number.");
        }
        else{
            System.out.println(num + " is a pallindrome number.");
        }
    }
}
