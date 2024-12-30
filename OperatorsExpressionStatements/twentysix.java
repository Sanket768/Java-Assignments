
/* Write a program to find the largest of three numbers using the ternary operator. */
import java.util.*;

class LargestThreeNumbers {
    private int num1, num2, num3;

    public LargestThreeNumbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void largestThreeNumbers() {
        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The largest number is: " + largest);
    }
}

public class twentysix {
    public static void main(String[] args) {
        int n1, n2, n3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            n1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            n2 = sc.nextInt();
            System.out.println("Enter the third number: ");
            n3 = sc.nextInt();
            LargestThreeNumbers largest = new LargestThreeNumbers(n1, n2, n3);
            largest.largestThreeNumbers();
        }
        catch(Exception e){
            System.out.println("Invalid input" + e.getMessage());
        }
    }

}
