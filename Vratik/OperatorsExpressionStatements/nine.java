/*
 * Determine if three sides form a valid triangle using the triangle inequality theorem.
 * The triangle inequality theorem states that the sum of any two sides of a triangle is greater than the length of the third side
 */
class Inequality {
    public static boolean isTriangle(int a, int b, int c) {
        // Check if the sum of any two sides is greater than the third side
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

public class nine {
    public static void main(String[] args) {
        System.out.println(Inequality.isTriangle(3, 4, 5)); // true
        System.out.println(Inequality.isTriangle(1, 2, 3)); // false
    }
}
