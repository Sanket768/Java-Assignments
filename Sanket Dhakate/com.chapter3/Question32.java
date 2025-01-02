/* Write a program to find the first number divisible by 7 in a range using break. */
public class Question32 {
    public static void main(String[] args) {
        int start = 1, end = 50;

        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.println("First number divisible by 7: " + i);
                break; 
            }
        }
    }
}
