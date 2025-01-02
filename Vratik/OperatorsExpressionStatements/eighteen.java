/* Swap two numbers using the bitwise XOR operator. */
class XORSwap {
    public int a, b;

    public XORSwap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}

public class eighteen {
    public static void main(String[] args) {
        XORSwap swap = new XORSwap(5, 10);
        System.out.println("Before swap: a = " + swap.a + ", b = " + swap.b);
        swap.swap();
        System.out.println("After swap: a = " + swap.a + ", b = " + swap.b);
    }
}
