/* Perform bitwise AND, OR, XOR, left shift, and right shift operations on two integers. */
class AndORXorShift {
    private int a, b;

    public AndORXorShift(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int bitwiseAND() {
        int result = a & b;
        return result;
    }

    public int bitwiseOR() {
        int result = a | b;
        return result;
    }

    public int bitwiseXOR() {
        int result = a ^ b;
        return result;
    }

    public int leftShift() {
        int result = a << b;
        return result;
    }

    public int rightShift() {
        int result = a >> b;
        return result;
    }
}

public class sixteen {
    public static void main(String[] args) {
        AndORXorShift solution = new AndORXorShift(5, 3);
        System.out.println("Bitwise AND: " + solution.bitwiseAND());
        System.out.println("Bitwise OR: " + solution.bitwiseOR());
        System.out.println("Bitwise XOR: " + solution.bitwiseXOR());
        System.out.println("Left Shift: " + solution.leftShift());
        System.out.println("Right Shift: " + solution.rightShift());
    }
}
