import java.util.Scanner;

public class twentyone {
    private static double a = 100;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            a = s.nextInt();
            System.out.println(a+=10);
            System.out.println(a-=10);
            System.out.println(a*=10);
            System.out.println(a/=10);
            System.out.println(a%=10);
        }
        finally{
            s.close();
        }
    }
}
