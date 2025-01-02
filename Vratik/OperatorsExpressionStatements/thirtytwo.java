/* Write a program to evaluate a mathematical expression: a^2 + 2ab + b^2. */
import java.util.*;
class MathExpr {
    private int a, b;

    public MathExpr(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int evaluate() {
        return (a * a) + (2 * a * b) + (b * b);
    }
}

public class thirtytwo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();
            MathExpr me = new MathExpr(a, b);
            System.out.println("The value of the expression is: " + me.evaluate());
        }
    }
}
