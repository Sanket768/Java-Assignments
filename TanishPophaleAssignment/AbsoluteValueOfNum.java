// Program to find the absolute vaue of a num

import java.util.Scanner;

public class AbsoluteValueOfNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int absNum = (num<0) ? Math.abs(num) : num;

        System.out.println("The absolute value of number " + num + " is: " + absNum);
    }
}
