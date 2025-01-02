
/* Find the reverse of a number using a while loop. */
import java.util.*;

class ReverseNumber {
    private int num;

    public ReverseNumber(int num) {
        this.num = num;
    }

    public int reverse() {
        int reversed = 0;
        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        return reversed;
    }
}

public class sixteen {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            ReverseNumber rn = new ReverseNumber(num);
            System.out.println("The reverse of the number is: " + rn.reverse());
        }
    }
}
