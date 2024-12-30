
/* Write a program to display the factorial of a number. */
import java.util.*;

class Factorial {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public int getFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

public class fourteen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            Factorial f = new Factorial(num);
            System.out.println("Factorial of " + num + " is " + f.getFactorial());
        }
    }
}
