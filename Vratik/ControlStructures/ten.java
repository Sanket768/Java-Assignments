/* Write a program to categorize a given character as uppercase, lowercase, or neither. */
import java.util.Scanner;
class CCate {
    private char c;

    public CCate(char c) {
        this.c = c;
    }

    public String categorize() {
        if (Character.isUpperCase(c)) {
            return "Uppercase";
        } else if (Character.isLowerCase(c)) {
            return "Lowercase";
        } else {
            return "Neither";
        }
    }
}

public class ten {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a character:");
            char c = sc.next().charAt(0);
            CCate cc = new CCate(c);
            System.out.println("The character '" + c + "' is " + cc.categorize());
        }
    }
}
