
/* 48. Calculate the sum of all even and odd numbers up to n using conditional and
arithmetic operators. */

class SumEvenOdd {
    private int sum = 0;
    private int n;

    public SumEvenOdd(int n) {
        this.n = n;
    }

    public void sumEvenOdd() {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum of even and odd numbers up to " + n + " is " + sum);
    }
}

public class fortyeight {
    public static void main(String[] args) {
        SumEvenOdd sumEvenOdd = new SumEvenOdd(23);
        sumEvenOdd.sumEvenOdd();
    }
}
