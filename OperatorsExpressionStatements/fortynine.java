
/* 49. Write a program to check if a number is prime using a loop and conditional
statements. */
import java.util.*;

class PrimeNo {
    private int n;

    public PrimeNo(int n) {
        this.n = n;
    }

    public boolean isPrime() {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class fortynine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            PrimeNo primeNo = new PrimeNo(n);
            if (primeNo.isPrime()) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }

        }
    }
}
