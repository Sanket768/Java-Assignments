/* Write a program to find the first number divisible by 7 in a range using break. */
public class thirtytwo {
    public static void main(String[] args) {
        int i = 20;
        while (i<100) {
            if (i % 7 == 0) {
                System.out.println("First number divisible by 7 is " + i);
                break;
                }
                i++;
                }
    }
}
