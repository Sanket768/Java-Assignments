/* Write a program to categorize a given character as uppercase, lowercase, or neither. */
public class Question10 {
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is neither an uppercase nor a lowercase letter.");
        }
    }
}
