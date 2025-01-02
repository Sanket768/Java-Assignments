/* Create a utility class MathUtils with static methods for common operations like factorial(), power(), etc. */
class MathUtils {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("2 raised to the power 3: " + MathUtils.power(2, 3));
    }
}
