/* Demonstrate the use of break and continue statements in a loop */

class fifty {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                continue; // Exit the loop when i is 5
            }
            i++;
            System.out.println(i);
        }
        System.out.println("Loop exited");
    }
}
