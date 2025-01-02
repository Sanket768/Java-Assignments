
/* 
 * 40. Write a program to print the multiplication table of a number using a for loop. Increment and Decrement Operators
 */
import java.util.*;

class MultiplicationTable {
    private int num;

    public MultiplicationTable(int num) {
        this.num = num;
    }

    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

public class forty {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            MultiplicationTable table = new MultiplicationTable(num);
            table.printTable();
        }
    }
}
