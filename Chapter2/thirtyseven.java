import java.util.Scanner;

class thirtyseven {
    private static double num1;
    private static double num2;
    private static double num3;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the first num: ");
            num1 = s.nextInt();
            System.out.println("Enter the second num: ");
            num2 = s.nextInt();
            System.out.println("Enter the third num: ");
            num3 = s.nextInt();

            if(num1>num2 && num1>num3){
                System.out.println("Num1 is largest");
            }
            else if(num2>num1 && num2>num3){
                System.out.println("Num2 is largest");
            }
            else{
                System.out.println("Num3 is largest");
            }
        }
        finally{
            s.close();
        }
    }    
}
