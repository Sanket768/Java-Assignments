/* Create a multiplication table for numbers from 1 to 10. */
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

public class twentyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc){
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            MultiplicationTable table = new MultiplicationTable(num);
            table.printTable();
        }
        finally{
            sc.close();
        }
    }
}
