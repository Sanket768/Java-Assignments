/* Calculate the sum of the first n natural numbers. */
public class Question12 {
    public static void main(String[] args) {
        int n = 10; 
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}