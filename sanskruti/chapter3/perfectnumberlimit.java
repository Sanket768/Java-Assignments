/* 38*/
package chapter3;

import java.util.Scanner;

public class perfectnumberlimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Perfect numbers up to " + limit + ":");
        for (int num = 1; num <= limit; num++) {
            int sum = 0;

            
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
