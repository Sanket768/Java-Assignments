/*
 * Check if a number is divisible by both 3 and 5.
 */
class Divisible {
    private int num;

    public Divisible(int num) {
        this.num = num;
    }

    public boolean isDivisible() {
        return num % 3 == 0 && num % 5 == 0;
    }
}

public class elevan {
    public static void main(String[] args) {
        Divisible divisible = new Divisible(15);
        System.out.println(divisible.isDivisible());
        Divisible divisible1 = new Divisible(20);
        System.out.println(divisible1.isDivisible());
    }
}
