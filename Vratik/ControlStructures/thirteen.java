
/* Print the multiplication table of a given number. */
import java.util.*;

class MultTable {
    private int num;

    public MultTable(int num) {
        this.num = num;
    }

    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

public class thirteen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            MultTable mt = new MultTable(num);
            mt.printTable();
        }
    }
}
