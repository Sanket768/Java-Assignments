/* Determine if three sides form a valid 
   triangle using the triangle inequality theorem. */
public class Que9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println( a + ", " + b + ", " + c
                    + " form a valid triangle.");
        } else {
            System.out.println( a + ", " + b + ", " + c
                    + " do not form a valid triangle.");

        }
    }
}
