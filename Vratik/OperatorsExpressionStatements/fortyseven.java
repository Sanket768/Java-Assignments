
/*
 * 47. Implement a program to check if a number is a palindrome using loops and
 * expressions.
 */
import java.util.Scanner;

class Palindrome {
    private int num;

    public Palindrome(int num) {
        this.num = num;
    }

    public boolean isPalindrome() {
        int temp = num;
        int reversed = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
        }
        return num == reversed;
    }
}

public class fortyseven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            Palindrome palindrome = new Palindrome(num);
            if (palindrome.isPalindrome()) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
        }
    }
}