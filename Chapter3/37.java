//unsolved
import java.util.Scanner;

class thirtyseven37 {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num = s.nextInt();
            System.out.println(num);
        }
        finally{
            s.close();
        }
    }
}
