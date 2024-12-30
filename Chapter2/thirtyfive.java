import java.util.Scanner;

class thirtyfive {
    private static double side1;
    private static double side2;
    private static double side3;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the first side: ");
            side1 = s.nextInt();
            System.out.println("Enter the second side: ");
            side2 = s.nextInt();
            System.out.println("Enter the third side: ");
            side3 = s.nextInt();
            double ss = side1+side2+side3/2;
            double area = Math.sqrt(ss*(ss-side1)*(ss-side2)*(ss-side3));

            System.out.println("Area of triangle is: " + area);
        }
        finally{
            s.close();
        }
    }    
}
