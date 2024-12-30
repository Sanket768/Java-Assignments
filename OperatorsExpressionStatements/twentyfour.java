/* 24. Write a program to calculate the sum of the first n natural numbers using an
assignment operator. */
class CalSum {
    private int n;

    public CalSum(int n) {
        this.n = n;
    }

    public int sum() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

public class twentyfour {
    public static void main(String[] args) {
        CalSum cs = new CalSum(10);
        System.out.println("Sum of first 10 natural numbers is: " + cs.sum());
    }
}
