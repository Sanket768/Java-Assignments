
/* Count the number of digits in an integer using while loop */
import java.util.*;

class CountDigit {
    private int num;

    public CountDigit(int num) {
        this.num = num;
    }

    public int countDigit() {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

public class eighteen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            CountDigit cd = new CountDigit(num);
            System.out.println("Number of digits: " + cd.countDigit());
        }
    }
}
