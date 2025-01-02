/* Demonstrate the use of increment operators in nested loops. */
public class fortyfive {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    System.out.print(i + j + k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
