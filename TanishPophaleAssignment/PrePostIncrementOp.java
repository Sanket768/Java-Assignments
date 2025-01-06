// Program for Post and Pre Increment Operator

import java.util.Scanner;

public class PrePostIncrementOp {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int preIncr = ++num;
        System.out.println("The value of preincrement plus of " + num + " is " + preIncr);

        int postIncr = num++;
        System.out.println("The value of postincrement plus of " + num + " is " + postIncr);

        
    }
}
