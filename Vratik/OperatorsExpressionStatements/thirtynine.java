
/* Use a while loop to reverse a number. */
import java.util.Scanner;

class ReverseNumber {
    private int num;
    private int reversedNum;

    public ReverseNumber(int num) {
        this.num = num;
        this.reversedNum = 0;
    }

    public void reverse() {
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + reversedNum);
    }

}

public class thirtynine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            ReverseNumber rn = new ReverseNumber(num);
            rn.reverse();// call the reverse method
        }
    }
}
