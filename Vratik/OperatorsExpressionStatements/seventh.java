/*
 * 6. Check if a given number lies within a specific range (e.g., 10 to 50).
 */
class Range {
    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean checkRange(int num) {
        if (num >= min && num <= max) {
            return true;
        } else {
            return false;
        }
    }
}

public class seventh {
    public static void main(String[] args) {
        Range r = new Range(10, 50);
        System.out.println(r.checkRange(20)); // true
        System.out.println(r.checkRange(60)); // false
    }
}
