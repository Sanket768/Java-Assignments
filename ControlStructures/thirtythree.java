/* 33. Create a program that stops processing numbers when a negative number is
encountered.
 */
public class thirtythree {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, -4, 5, 6, 7, 8, 9, 10 };
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < 0) {
                break;
            }
            System.out.println(numbers[i]);
            i++;
        }
    }
}
