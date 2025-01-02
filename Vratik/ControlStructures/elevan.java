
/* Print all even numbers from 1 to 100. */
import java.util.Scanner;

class EvenNum {
    private int num;

    public void getNum() {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
    }

    public void printEven() {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

public class elevan {
    public static void main(String[] args) {
        EvenNum even = new EvenNum();
        even.getNum();
        even.printEven();
    }
}
