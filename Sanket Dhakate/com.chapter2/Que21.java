/* Demonstrate the use of +=, -=, *=, /=, and %= operators in a program. */
class Que21{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a += b;
        System.out.println("a += b; a = " + a);
        a -= b;
        System.out.println("a -= b; a = " + a);
        a *= b;
        System.out.println("a *= b; a = " + a);
        a /= b;
        System.out.println("a /= b; a = " + a);
        a %= b;
        System.out.println("a %= b; a = " + a);
    }
}
