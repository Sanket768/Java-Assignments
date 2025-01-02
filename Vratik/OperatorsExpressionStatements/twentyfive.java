/*
 * Demonstrate how compound assignment operators work with different data types.
 */
class CompoundAssignment {
    private int a, b;
    private float x, y;
    private double z, w;

    public CompoundAssignment(int a, int b, float x, float y, double z, double w) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public void add() {
        a += b;
        System.out.println("Add a & b = " + a);
        x += y;
        System.out.println("Add x & y = " + x);
        z += w;
        System.out.println("Add z & w = " + z);
    }

    public void subtract() {
        a -= b;
        System.out.println("Sub a & b = " + a);
        x -= y;
        System.out.println("Sub x & y = " + x);
        z -= w;
        System.out.println("Sub z & w = " + z);
    }

    public void multiply() {
        a *= b;
        System.out.println("Multiply a & b = " + a);
        x *= y;
        System.out.println("Multiply x & y = " + x);
        z *= w;
        System.out.println("Multiply z & w = " + z);
    }

    public void divide() {
        a /= b;
        System.out.println("Divide a & b = " + a);
        x /= y;
        System.out.println("Divide x & y = " + x);
        z /= w;
        System.out.println("Divide z & w = " + z);
    }

}

public class twentyfive {
    public static void main(String[] args) {
        CompoundAssignment ca = new CompoundAssignment(10, 2, 5.5f, 3.3f, 7.7, 8.8);
        ca.add();
        ca.subtract();
        ca.multiply();
        ca.divide();
    }
}
