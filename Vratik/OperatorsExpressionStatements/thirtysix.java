
/* Use an if-else statement to check if a number is even or odd. */
import java.util.Scanner;

class EvenOdd {
    private int num;

    public EvenOdd(int num) {
        this.num = num;
    }

    public void checkEvenOdd() {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}

public class thirtysix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            EvenOdd obj = new EvenOdd(num);
            obj.checkEvenOdd();
        }
    }
}
