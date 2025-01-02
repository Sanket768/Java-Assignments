/* Write a program to check if a number is a multiple of 2, 3, or 5. */
import java.util.Scanner;
class Que46{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(num % 2 == 0) {
            System.out.println("Number is multiple of 2");
        }
        if(num % 3 == 0) {
            System.out.println("Number is multiple of 3");
        }
        if(num % 5 == 0) {
            System.out.println("Number is multiple of 5");
        }
    }
}