// Power of a Number using Math class and * operator

import java.util.Scanner;

public class Power {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no for which you have to find the power of:  ");
        int a = sc.nextInt();


        System.out.println("Enter the power you want to find for that no: ");
        int b = sc.nextInt();


        // Using Math Class
        System.out.println("The power of " + a + " raised to " + b + " is: " + Math.pow(a, b));


        // Using * operator
        double p = 1;

        for(int i=1;i<=b;i++){
            p = p*a;
        }

        System.out.println("The power of " + a + " raised to " + b + " is: " + p);
    }
}
