/* Demonstrate the use of break and continue statements in a loop*/
package chapter2;

public class breakdemo {
    public static void main(String[] args) {
        System.out.println("Using break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; 
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nUsing continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println("i = " + i);
        }
    }
}
