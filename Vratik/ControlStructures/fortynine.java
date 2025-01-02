
/*Write a recursive program to reverse a string. */
import java.util.*;

public class fortynine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("Reversed string: " + reverse(str));
        }
    }

    public static String reverse(String str) {
        if (str.length() == 0) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

}
