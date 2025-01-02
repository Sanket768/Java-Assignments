
/* Calculate the sum of digits of a number using while loop */
import java.util.*;

class SumDigit {
    private int num;

    public SumDigit(int num) {
        this.num = num;
    }

    public int sumDigit() {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

public class nineteen {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            SumDigit sd = new SumDigit(num);
            System.out.println("Sum of digits of " + num + " is " + sd.sumDigit());
        }
    }
}
