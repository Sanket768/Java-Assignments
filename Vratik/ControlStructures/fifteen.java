
/* Generate the Fibonacci sequence up to n terms. */
import java.util.*;

class Fibo {
    private int num;

    public Fibo(int n) {
        num = n;
    }

    public int[] getFibo() {
        int[] fibo = new int[num];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }
}

public class fifteen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of terms:");
            int n = sc.nextInt();
            Fibo fibo = new Fibo(n);
            int[] fiboArray = fibo.getFibo();
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fiboArray[i] + " ");
            }
            System.out.println();
        }
    }
}
