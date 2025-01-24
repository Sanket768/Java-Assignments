import java.util.Scanner;

class thirtyone {
    private static double a;
    private static double b;
    private static double c;
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the value of a: ");
            a = s.nextDouble();
            System.out.println("Enter the value of b: ");
            b = s.nextDouble();
            System.out.println("Enter the value of c: ");
            c = s.nextDouble();

            double p = Math.sqrt((b*b)-(4*a*c));

            double first = -( b - p ) / 2*a;
            double second =  -( b + p )/ 2*a;

            System.out.println("The roots of quadratic equation are: " + first + " and " + second);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
