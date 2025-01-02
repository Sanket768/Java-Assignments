
/* Check if a number is a palindrome using while loop */
import java.util.*;

class Palindrome {
    private int num;

    public Palindrome(int num) {
        this.num = num;
    }

    public boolean isPalindrome() {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return (rev == num);
    }
}

public class seventeen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            Palindrome p = new Palindrome(num);
            if (p.isPalindrome()) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
        }
    }
}
