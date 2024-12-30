import java.util.Scanner;

class twentysix {
    private static double a;
    private static double b;
    private static double c;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            a = s.nextDouble();
            System.out.println("Enter second number: ");
            b = s.nextDouble();
            System.out.println("Enter third number: ");
            c = s.nextDouble();

            System.out.println((a>b && a>c) ? + a + " is largest number" : ((b>c && b>a) ? + b +" is largest number" :  + c +" is largest number"));
        }
        finally{
            s.close();
        }
    }    
}
