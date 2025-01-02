/* Use a while loop to reverse a number. */
class Que39{
    public static void main(String[] args) {
        int num = 123456;
        int reversedNum = 0;
        int digit = 0;
        while (num!= 0) {
            digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversedNum);
    }
}