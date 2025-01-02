
/* Calculate the sum of the first n natural numbers. */
import java.util.*;

class SumNo {
    private int num;

    public SumNo(int num) {
        this.num = num;
    }

    public int sum() {
        return num * (num + 1) / 2;
    }
}

public class twelve {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of natural numbers to sum:");
            int n = sc.nextInt();
            SumNo s = new SumNo(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + s.sum());
        }
    }
}
