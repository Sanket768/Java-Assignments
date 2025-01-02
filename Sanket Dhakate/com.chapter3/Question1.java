/* Check if a number is positive, negative, or zero using if-else. */
class Question1 {
    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.err.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }

    }
}