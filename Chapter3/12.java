import java.util.Scanner;

class twelv {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = s.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum = sum + i;
        }
        System.out.println(sum);

        s.close();
    }
}
