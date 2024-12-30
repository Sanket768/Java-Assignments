import java.util.Scanner;

class thirtysix36 {
    private static int num1;
    private static int num2;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the number: ");
            num1 = s.nextInt();
            System.out.println("Enter another number: ");
            num2 = s.nextInt();

            for(int i=2;i<=num1 && i<=num2;i++){
                if(num1%i==0 && num2%i==0){
                    System.out.println("GCD: " + i);
                    break;
                }
            }
            
        }
        finally{
            s.close();
        }
    }
}
