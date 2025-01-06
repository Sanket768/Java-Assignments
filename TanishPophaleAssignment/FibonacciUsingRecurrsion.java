// Program to find the nth fibonacci number using recurrsion

import java.util.Scanner;

public class FibonacciUsingRecurrsion {
    
    public static int fibonacci(int num){

        if(num==0 || num==1){
            return num;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which fibonacci number you want:  ");
        int num = sc.nextInt();

        int nthFibonacciNo = fibonacci(num);
        System.out.println("The " + num + "th fibonacci number is: " + nthFibonacciNo);
    }
}
