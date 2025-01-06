// Program to check whether a number is positive, negative or zero

import java.util.Scanner;

public class PositiveNegativeZeroTernaryOp {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();

        String s = (num>0) ? "Postive" : ((num<0) ? "Negative" : "Zero");

        System.out.println("The number " + num + " is " + s);

        
    }
}
