/* Count the number of set bits (1s) in a binary representation of a number. */
class BitsBinaryRepresentation {
    private int n;

    public BitsBinaryRepresentation(int n) {
        this.n = n;
    }

    public int countSetBits() {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}

public class ninteen {
    public static void main(String[] args) {
        BitsBinaryRepresentation bits = new BitsBinaryRepresentation(15);
        System.out.println("Number of set bits: " + bits.countSetBits());
    }
}
