/*
 * 6. Write a program to check if a number is greater than, less than, or equal to another number.
 */

class NumCheck {
    int a, b;

    public NumCheck(int x, int y) {
        a = x;
        b = y;
    }

    public void check() {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}

public class sixth {
    public static void main(String[] args) {
        NumCheck num = new NumCheck(520, 300);
        num.check();
    }
}
