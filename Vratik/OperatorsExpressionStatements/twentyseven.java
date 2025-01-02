
/*
 * Check if a number is positive, negative, or zero using a ternary operator.
 */
import java.util.Scanner;

class PositiveNegativeZero {
    private int num1;

    public PositiveNegativeZero(int num1) {
        this.num1 = num1;
    }

    public void Calc() {
        String result = (num1 > 0) ? "Positive" : (num1 < 0) ? "Negative" : "Zero";
        System.out.println("The number is " + result);
    }
}

public class twentyseven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            PositiveNegativeZero p = new PositiveNegativeZero(num);
            p.Calc();
        }
        catch(Exception e){
            System.out.println("Invalid input" + e.getMessage());
        }
    }
}
