import java.util.Scanner;

class thirtytwo {
    private static int a;
    private static int b;
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in);){
            System.out.println("Enter the value of a: ");
            a = s.nextInt();
            System.out.println("Enter the value of b: ");
            b = s.nextInt();
            int result = a*a + 2*a*b + b*b;
            System.out.println("Value of expression a^2 + 2ab + b^2 is " + result);
        }
    }    
}
