
/* Solve the Tower of Hanoi problem using recursion. */
import java.util.*;

public class fifty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter the number of disk: ");
            int n = sc.nextInt();
            hanoi(n, 'A', 'C', 'B');
        }
    }

    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + from + " to peg " +
                    to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from peg " + from +
                " to peg " + to);
        hanoi(n - 1, aux, to, from);
    }

}
