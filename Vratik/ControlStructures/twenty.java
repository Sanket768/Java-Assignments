
/* Print all prime numbers up to a given number using while loop */
import java.util.*;

class PrimeNo {
    private int num;

    public PrimeNo(int n) {
        num = n;
    }

    public void printPrime() {
        int i = 2;
        while (i <= num) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}

public class twenty {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            PrimeNo p = new PrimeNo(n);
            p.printPrime();
        }
    }
}
