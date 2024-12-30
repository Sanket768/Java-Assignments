
/* 42. Write a program to generate the first n terms of the Fibonacci series using increment
operators. */
import java.util.Scanner;

class Fibonacci {
    private int n;

    public void getdata() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of terms:");
            n = sc.nextInt();
        }
    }

    public void display() {
        int t1 = 0, t2 = 1;
        System.out.println("Fibonacci series:");
        System.out.print(t1 + " " + t2 + " ");
        for (int i = 3; i <= n; i++) {
            int temp = t1 + t2;
            t1 = t2;
            t2 = temp;
            System.out.print(temp + " ");
        }
    }
}

public class fortytwo {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.getdata();
        f.display();
    }
}
