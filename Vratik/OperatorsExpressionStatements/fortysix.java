
/* Write a program to check if a number is a multiple of 2, 3, or 5. */
import java.util.Scanner;

class MultNum {
    private int num;

    public MultNum(int num) {
        this.num = num;
    }

    public boolean isMultipleOf2() {
        return num % 2 == 0;
    }

    public boolean isMultipleOf3() {
        return num % 3 == 0;
    }

    public boolean isMultipleOf5() {
        return num % 5 == 0;
    }

    public void checkMultiple() {
        if (isMultipleOf2() || isMultipleOf3() || isMultipleOf5()) {
            System.out.println(num + " is a multiple of 2, 3 or 5.");
        } else {
            System.out.println(num + " is not a multiple of 2, 3 or 5");
        }
    }
}

public class fortysix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            MultNum multNum = new MultNum(num);
            multNum.checkMultiple();
        }
    }
}
