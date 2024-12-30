/* Check if a number is positive, negative, or zero using if-else. */

class NumCheck {
    private int num;

    public NumCheck(int num) {
        this.num = num;
    }

    public void check() {
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
    }
}

class first {
    public static void main(String[] args) {
        NumCheck nc = new NumCheck(5);
        nc.check();
    }
}