/* 
 * Create a utility class MathUtils with static methods for common operations like factorial(), power(), etc.
 */
class MathUtils {
    @SuppressWarnings("unused")
    private int num;

    public MathUtils(int n) {
        this.num = n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}

public class twenty {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Create an instance of MathUtils with num = 5
        MathUtils mathUtils = new MathUtils(5);
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("Power of 2 with exponent 3: " + MathUtils.power( 2, 3));
    }
}
