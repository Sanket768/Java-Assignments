/* Check if a number is even or odd using the bitwise AND operator. */
class EvenOddBitwise {
    private int num;

    public EvenOddBitwise(int num) {
        this.num = num;
    }

    public boolean isEven() {
        return (num & 1) == 0;
    }

    public boolean isOdd() {
        return (num & 1) != 0;
    }
}

public class seventeen {
    public static void main(String[] args) {
        EvenOddBitwise solution = new EvenOddBitwise(10);
        System.out.println(solution.isEven());  // prints: true
        System.out.println(solution.isOdd());    // prints: false
    }
}
