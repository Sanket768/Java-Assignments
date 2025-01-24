//Write a program to solve the equation: (a + b)^3.

import java.util.Scanner;

class thirtyfour {
    private static int a;
    private static int b;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the value of a: ");
            a = s.nextInt();
            System.out.println("Enter the value of b: ");
            b = s.nextInt();

            int res = (a+b)*(a+b)*(a+b);
            System.out.println("Cube of (a+b) is: " + res);
        }
        finally{
            s.close();
        }
    }
}
