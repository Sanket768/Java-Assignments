
/* Implement a program to simulate a countdown timer. */
import java.util.Scanner;

class Que44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter the hours: ");
        int hours = scanner.nextInt();
        System.err.println("Enter the minutes: ");
        int minutes = scanner.nextInt();

        try {
            for (int i = hours; i >= 0; i--) {
                for (int j = minutes; j >= 0; j--) {
                    for (int k = 59; k >=0; k--){
                       System.out.println(i + ":" + j + ":" + k);
                        Thread.sleep(1000); 
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}