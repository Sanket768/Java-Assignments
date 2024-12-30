
/*
 * Use a ternary operator to find the absolute value of a number.
 */
import java.util.*;

class AbsNum {
    private int num;

    public AbsNum(int num) {
        this.num = num;
    }

    public int getAbs() {
        return Math.abs(num);
    }
}

public class thirty {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            AbsNum abs = new AbsNum(num);
            System.out.println("Absolute value of the number is: " + abs.getAbs());
        }
    }
}
